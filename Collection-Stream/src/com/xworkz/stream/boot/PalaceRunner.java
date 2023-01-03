package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> palace = new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Mysure", "Mysure", "King", false, 50));

		palace.add(new PalaceDTO("Bengalore", "Bengalore", "Kempegwoda", true, 60));

		palace.add(new PalaceDTO("N R Palace", "Bengalore", "Mestri", false, 10));

		palace.add(new PalaceDTO("Llita Mahala", "Bengalore", "Lalita", true, 20));

		palace.stream().filter(dto -> dto.isDestroyed()).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));

	}

}
