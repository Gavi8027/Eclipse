package com.xworkz.exception;

import java.awt.AWTError;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.image.RasterFormatException;
import java.awt.print.PrinterAbortException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.NotActiveException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URISyntaxException;
import java.net.UnknownServiceException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.time.zone.ZoneRulesException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TooManyListenersException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

import javax.lang.model.type.MirroredTypeException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMRuntimeException;
import javax.naming.AuthenticationException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.w3c.dom.DOMException;
import org.w3c.dom.ls.LSException;

import com.sun.javafx.geom.IllegalPathStateException;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;
import com.sun.xml.internal.ws.spi.db.DatabindingException;

import sun.dc.pr.PRError;

public class ExceptionConcept {
	
	public void m1() throws Exception {
		System.out.println("Running m1");
		throw new Exception();
	}
	public void m2()  {
		System.out.println("Running m2");
		throw new Error();
	}
	public void m3(){
		System.out.println("Running m3");
		throw new RuntimeException();
   }
	public void m4() {
		System.out.println("Running m4");
		throw new IncompleteAnnotationException(null, null);
	}
	
	public void m5() {
		System.out.println("Running m5");
		throw new IllegalStateException();
}
	
	public void m6() {
		System.out.println("Running m6");
		throw new IllegalPathStateException();

	}
	
	public void m7() {
		System.out.println("Running m7");
		throw new IllegalArgumentException();
	}
	
	public void m8() {
		System.out.println("Running m8");
		throw new FileSystemNotFoundException();
	}
	public void m9() {
		System.out.println("Running m9");
		throw new EnumConstantNotPresentException(null, null);
	}
	
	public void m10() {
		System.out.println("Running m10");
		throw new EmptyStackException();
	}
	
	public void m11() {
		System.out.println("Running m11");
		throw new DOMException((short) 0, null);
	}
	
	public void m12() {
		System.out.println("Running m12");
		throw new DatabindingException();
	}
	
	public void m13() {
		System.out.println("Running m13");
		throw new ConcurrentModificationException();
	}
	
	public void m14() throws Exception {
		System.out.println("Running m14");
		throw new Exception();
	}
	
	public void method15() throws MidiUnavailableException {
		System.out.println("Running m15");
		throw new MidiUnavailableException();
	}
	
	public void m16() throws AuthenticationException {
		System.out.println("Running m16");
		throw new AuthenticationException();
	}
	
	public void m17() throws AlreadyBoundException {
		System.out.println("Running m17");
		throw new AlreadyBoundException();
	}
	
	public void m18() throws InvalidApplicationException {
		System.out.println("Running m18");
		throw new InvalidApplicationException(getClass());
	}
	
	public void m19() throws BadBinaryOpValueExpException {
		System.out.println("Running m19");
		throw new BadBinaryOpValueExpException(null);
	}
	
	public void m20() throws BadLocationException {
		System.out.println("Running m20");
		throw new BadLocationException(null, 0);
	}
	
	public void m21() throws BadStringOperationException {
		System.out.println("Running m21");
		throw new BadStringOperationException(null);
	}
	
	public void m22() throws BadBinaryOpValueExpException {
		System.out.println("Running m22");
		throw new BadBinaryOpValueExpException(null);
	}
	
	public void m23() throws BadLocationException {
		System.out.println("Running m23");
		throw new BadLocationException(null, 0);
	}
	
	public void m24() throws ParseException {
		System.out.println("Running m24");
		throw new ParseException(null, 0);
	}
	
	public void m25() throws ParserConfigurationException {
		System.out.println("Running m25");
		throw new ParserConfigurationException(null);
	}
	
	public void m26() throws PrinterAbortException {
		System.out.println("Running m26");
		throw new PrinterAbortException();
	}
	
	public void m27() throws TransformerConfigurationException {
		System.out.println("Running m27");
		throw new TransformerConfigurationException();
	}
	
	public void m28() throws TooManyListenersException {
		System.out.println("Running m28");
		throw new TooManyListenersException();
	}
	
	public void m29() {
		System.out.println("Running m29");
		throw new VerifyError();
	}
	
	public void m30() {
		System.out.println("Running m30");
		throw new UnsatisfiedLinkError();
	}
	
	public void m31() {
		System.out.println("Running m31");
		throw new StackOverflowError();
	}
	
	public void m32() {
		System.out.println("Running m32");
		throw new NoSuchFieldError();
	}	
		public void m33() {
			System.out.println("Running m33");
					throw new PRError();
		}
		
		public void m34() {
			System.out.println("Running m34");
			throw new FactoryConfigurationError();
		}
		
		public void m35() {
			System.out.println("Running m35");
			throw new IOError(null);
		}
		
		public void m36() {
			System.out.println("Running m36");
			throw new LinkageError();
		}
		
		public void m37() {
			System.out.println("Running m37");
			throw new ThreadDeath();
		}
		
		public void m38() {
			System.out.println("Running m38");
			throw new TransformerFactoryConfigurationError();
		}
		
		public void m39() {
			System.out.println("Running m39");
			throw new AbstractMethodError();
		}
		
		public void m40() {
			System.out.println("Running m40");
			throw new BootstrapMethodError();
		}
		
		public void m41() {
			System.out.println("Running m41");
			throw new ClassCircularityError();
		}
		
		public void m42() {
			System.out.println("Running m42");
			throw new ClassFormatError();
		}
		
		public void m43() {
			System.out.println("Running m43");
			throw new ExceptionInInitializerError();
		}
		
		public void m44() throws UnknownServiceException {
			System.out.println("Running m44");
			throw new UnknownServiceException();
		}
		
		public void m45() throws UserPrincipalNotFoundException {
			System.out.println("Running m45");
			throw new UserPrincipalNotFoundException(null);
		}
		
		public void m46() throws URISyntaxException {
			System.out.println("Running m46");
			throw new URISyntaxException(null, null);
		}
		
		public void m47() throws URIReferenceException {
			System.out.println("Running m47");
			throw new URIReferenceException();
		}
		
		public void m48() throws PrivilegedActionException {
			System.out.println("Running m48");
			throw new PrivilegedActionException(null);
		}
		
		public void m49() throws PropertyVetoException {
			System.out.println("Running m49");
			throw new PropertyVetoException(null, null);
		}
		
		public void m50() throws MarshalException {
			System.out.println("Running m50");
			throw new MarshalException(null);
		}
		
		public void m51() throws NotActiveException {
			System.out.println("Running m51");
			throw new NotActiveException();
		}
		
		public void m52() throws NotBoundException {
			System.out.println("Running m52");
			throw new NotBoundException();
		}
		
		public void m53() throws LineUnavailableException {
			System.out.println("Running m53");
			throw new LineUnavailableException();
		}

		public void m54() {
			System.out.println("Running m54");
			throw new RuntimeException();
		}

		public void m55() {
			System.out.println("Running m55");
			throw new WrongMethodTypeException();
		}
		
		public void m56() {
			System.out.println("Running m56");
			throw new UnsupportedOperationException();
		}
		
		public void m57() {
			System.out.println("Running m57");
			throw new UnmodifiableSetException();
		}
		
		public void m58() {
			System.out.println("Running m58");
			throw new UndeclaredThrowableException(null);
		}
		
		public void m59() {
			System.out.println("Running m59");
			throw new TypeNotPresentException(null, null);
		}
		
		public void m60() {
			System.out.println("Running m60");
			throw new SecurityException();
		}
		
		public void m61() {
			System.out.println("Running m61");
			throw new RejectedExecutionException();
		}
		
		public void m62() {
			System.out.println("Running m62");
			throw new RasterFormatException(null);
		}
		
		public void m63() {
			System.out.println("Running m63");
			throw new ProviderNotFoundException();
		}

		public void m64() throws IllegalClassFormatException {
			System.out.println("Running m64");
			throw new IllegalClassFormatException();
		}
		public void m65() throws GSSException {
			System.out.println("Running m65");
			throw new GSSException(0);
		}
		public void m66() throws GeneralSecurityException {
			System.out.println("Running m66");
			throw new GeneralSecurityException();
		}
		
		public void m67() throws ZoneRulesException {
			System.out.println("Running m67");
			throw new ZoneRulesException(null, null);
		}
		
		public void m68() throws InvalidMidiDataException {
			System.out.println("Running m68");
			throw new InvalidMidiDataException();
		}
		
		public void m69() throws FontFormatException {
			System.out.println("Running m69");
			throw new FontFormatException(null);
		}
		
		public void m70() throws ExecutionException {
			System.out.println("Running m70");
			throw new ExecutionException(null);
		}
		
		public void m71() throws DestroyFailedException {
			System.out.println("Running m71");
			throw new DestroyFailedException();
		}
		public void m72() throws GeneralSecurityException {
			System.out.println("Running m72");
			throw new GeneralSecurityException();
		}
		
		public void m73() throws DestroyFailedException {
			System.out.println("Running m73");
			throw new DestroyFailedException();
		}
		
		public void m74() {
			System.out.println("Running m74");
			throw new CoderMalfunctionError(null);
		}

		public void m75() {
			System.out.println("Running m75");
			throw new AWTError(null);
		}
		
		public void m76() {
			System.out.println("Running m76");
			throw new AssertionError();
		}
		
		public void m77() {
			System.out.println("Running m77");
			throw new AbstractMethodError();
		}
		
		public void m78() {
			System.out.println("Running m78");
			throw new Error();
		}
		
		public void m79() {
			System.out.println("Running m79");
			throw new ArrayStoreException();
		}
		public void m80() {
			System.out.println("Running m80");
			throw new BufferOverflowException();
		}
		
		public void m81() {
			System.out.println("Running m81");
			throw new BufferUnderflowException();
		}
		
		public void m82() {
			System.out.println("Running m82");
			throw new CannotRedoException();
		}
		
		public void m83() {
			System.out.println("Running m83");
			throw new CMMException(null);
		}
		public void m84() {
			System.out.println("Running m84");
			throw new UnknownError();
		}
		public void m85() {
			System.out.println("Running m85");
			throw new ServiceConfigurationError("nusha");
		}
		public void m86() {
			System.out.println("Running m86");
			throw new ServiceConfigurationError("Str");
		}
		public void m87() {
			System.out.println("Running m87");
			throw new InternalError();
		}
		
		public void m88() {
			System.out.println("Running m88");
			throw new InstantiationError();
		}
		
		public void m89() {
			System.out.println("Running m89");
			throw new GenericSignatureFormatError();
		}
		
		public void m90() {
			System.out.println("Running m90");
			throw new VerifyError();
		}
		
		public void m91() {
			System.out.println("Running m91");
			throw new UnsatisfiedLinkError();
		}
		
		public void m92() {
			System.out.println("Running m92");
			throw new NoClassDefFoundError();
		}
		
		public void m93() {
			System.out.println("Running m93");
			throw new IncompatibleClassChangeError();
		}
		
		public void m94() {
			System.out.println("Running m94");
			throw new IndexOutOfBoundsException();
		}
		
		public void m95() {
			System.out.println("Running m95");
			throw new JMRuntimeException();
		}
		
		public void m96() {
			System.out.println("Running m96");
			throw new LSException((short) 0, null);
		}
		
		public void m97() {
			System.out.println("Running m97");
			throw new MalformedParameterizedTypeException();
		}
		
		public void m98() {
			System.out.println("Running m98");
			throw new MirroredTypeException(null);
		}
		
		public void m99() {
			System.out.println("Running m99");
			throw new MissingResourceException(null, null, null);
		}
		
		public void m100() {
			System.out.println("Running m100");
			throw new NegativeArraySizeException();
		}
		
		public void m101() {
			System.out.println("Running m101");
			throw new NoSuchElementException();
		}
		
		public void m102() {
			System.out.println("Running m102");
			throw new NoSuchMechanismException();
		}
		
		public void m103() {
			System.out.println("Running m103");
			throw new NullPointerException();
		}
		
		
		}	