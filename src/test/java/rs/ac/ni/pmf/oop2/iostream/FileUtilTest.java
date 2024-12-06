package rs.ac.ni.pmf.oop2.iostream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

class FileUtilTest
{
	@Test
	void shouldCreateNumbersFile() throws IOException
	{
		FileUtil.createNumberFile("output/numbers_256.txt", 10, 256);
	}

	@Test
	void shouldCreateLargeFileUnbuffered() throws IOException
	{
		final long start = System.currentTimeMillis();
		FileUtil.createNumberFile("output/large_unbuffered.dat", 10_000_000, 0);
		final long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " ms");
	}

	@Test
	void shouldCreateLargeFileBuffered() throws IOException
	{
		final long start = System.currentTimeMillis();
		FileUtil.createBufferedFile("output/large_buffered.dat", 10_000_000);
		final long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " ms");
	}

	@Test
	void shouldCreateLargeFileBufferedWithBOS() throws IOException
	{
		final long start = System.currentTimeMillis();
		FileUtil.createBufferedFileWithBufferedStreams("output/large_buffered.dat", 10_000_000);
		final long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " ms");
	}

	@Test
	void shouldCopyFile()
	{
		try
		{
			FileUtil.copy("data/in.txt", "output/out.txt");
		}
		catch (final FileNotFoundException e)
		{
			System.out.println("Some of the files are not available. Error: " + e.getMessage());
		}
		catch (final IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
