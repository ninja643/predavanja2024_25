package rs.ac.ni.pmf.oop2.iostream;

import java.io.*;

public class FileUtil
{
	private static final int BUFFER_SIZE = 8192;

	public static void createNumberFile(final String fileName, final int count, final int offset)
			throws IOException
	{
		final OutputStream out = new FileOutputStream(fileName);

		for (int i = 0; i < count; i++)
		{
			out.write(i + offset);
		}

		out.close();
	}

	public static void createBufferedFile(final String fileName, final int count)
			throws IOException
	{
		final byte[] buffer = new byte[BUFFER_SIZE];
		int currentBufferPosition = 0;

		try (final OutputStream out = new FileOutputStream(fileName))
		{
			for (int i = 0; i < count; i++)
			{
				if (currentBufferPosition == BUFFER_SIZE)
				{
					out.write(buffer, 0, currentBufferPosition);
					currentBufferPosition = 0;
				}

				buffer[currentBufferPosition++] = (byte) i;
			}

			out.write(buffer, 0, currentBufferPosition);
		}
	}

	public static void createBufferedFileWithBufferedStreams(final String fileName, final int count) throws IOException
	{
		try (final OutputStream out = new BufferedOutputStream(new FileOutputStream(fileName)))
		{
			for (int i = 0; i < count; i++)
			{
				out.write(i);
			}
		}
	}

	public static void copy(final String inputFileName, final String outputFileName)
			throws IOException
	{

		try (final InputStream in = new FileInputStream(inputFileName);
			 final OutputStream out = new FileOutputStream(outputFileName))
		{

			int c;
			while ((c = in.read()) != -1)
			{
				out.write(c);
			}
		} finally
		{
			System.out.println("Finally!!!");
		}

	}
}
