package com.xworkz.mobile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/mob")
public class MobileServlet extends HttpServlet {

	public MobileServlet() {
		System.out.println("Creating..." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in MobileServlet");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in MobileServlet");
		System.out.println(Thread.currentThread().getName());
		String mobilename = req.getParameter("mobilename");
		String company = req.getParameter("company");
		String price = req.getParameter("price");
		String ram = req.getParameter("ram");
		String rom = req.getParameter("rom");
		String color = req.getParameter("color");
		String length = req.getParameter("length");
		String width = req.getParameter("width");
		String camera = req.getParameter("camera");
		String bluetooth = req.getParameter("bluetooth");
		String speakers = req.getParameter("speakers");
		String display = req.getParameter("display");
		String app = req.getParameter("app");
		String charger = req.getParameter("charger");
		String battery = req.getParameter("battery");
		String sim = req.getParameter("sim");
		String currency = req.getParameter("currency");
		String backCover = req.getParameter("backCover");
		String photos = req.getParameter("photos");
		String videos = req.getParameter("videos");
		String files = req.getParameter("files");

		System.out.println(mobilename);
		System.out.println(company);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(color);
		System.out.println(length);
		System.out.println(width);
		System.out.println(camera);
		System.out.println(bluetooth);
		System.out.println(speakers);
		System.out.println(display);
		System.out.println(app);
		System.out.println(charger);
		System.out.println(battery);
		System.out.println(sim);
		System.out.println(currency);
		System.out.println(backCover);
		System.out.println(photos);
		System.out.println(videos);
		System.out.println(files);

		PrintWriter writer = resp.getWriter();
		writer.print("html");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("span style='color:green;'>");
		writer.print("mobile name " + mobilename + "is sent sucessfully");
		writer.print("mobile company " + company + "is sent sucessfully");
		writer.print("mobile price " + price + "is sent sucessfully");
		writer.print("mobile ram " + ram + "is sent sucessfully");
		writer.print("mobile rom " + rom + "is sent sucessfully");
		writer.print("mobile color " + color + "is sent sucessfully");
		writer.print("mobile length " + length + "is sent sucessfully");
		writer.print("mobile width " + width + "is sent sucessfully");
		writer.print("mobile camera " + camera + "is sent sucessfully");
		writer.print("mobile bluetooth " + bluetooth + "is sent sucessfully");
		writer.print("mobile speakers " + speakers + "is sent sucessfully");
		writer.print("mobile display " + display + "is sent sucessfully");
		writer.print("mobile app " + app + "is sent sucessfully");
		writer.print("mobile charger " + charger + "is sent sucessfully");
		writer.print("mobile battery " + battery + "is sent sucessfully");
		writer.print("mobile sim " + sim + "is sent sucessfully");
		writer.print("mobile currency " + currency + "is sent sucessfully");
		writer.print("mobile backCover " + backCover + "is sent sucessfully");
		writer.print("mobile photos " + photos + "is sent sucessfully");
		writer.print("mobile videos " + videos + "is sent sucessfully");
		writer.print("mobile files " + files + "is sent sucessfully");

	}

}
