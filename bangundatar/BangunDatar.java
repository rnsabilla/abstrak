package bangundatar;

public abstract class BangunDatar
{
	// Mengimplementasi luas() dan keliling()
	abstract void luas();
	abstract void keliling();
}

class Persegi extends BangunDatar
{
	private float sisi;// Hanya bisa di modify melalui method setSisi()

	void setSisi(float sisi)
	{
		this.sisi = sisi;
	}

        @Override
	void luas()
	{
		System.out.println(sisi * sisi);
	}

        @Override
	void keliling()
	{
		System.out.println(sisi * 4);
	}
}

abstract class Segitiga extends BangunDatar
{
	private float alas;
	private float tinggi;

	void setAlas(float alas)
	{
		this.alas = alas;
	}

	void setTinggi(float tinggi)
	{
		this.tinggi = tinggi;
	}

	float getAlas()
	{
		return this.alas;
	}

	float getTinggi()
	{
		return this.tinggi;
	}

        @Override
	void luas()
	{
		System.out.println((alas * tinggi) / 2);
	}
}

class SegitigaSiku extends Segitiga
{
        @Override
	void keliling()
	{
		System.out.println( Math.sqrt( Math.pow(getAlas(), 2) + Math.pow(getTinggi(), 2) ) );
	}
}

class SegitigaSamaKaki extends Segitiga
{
        @Override
	void keliling()
	{
		System.out.println(2 * Math.sqrt( Math.pow(getAlas()/2, 2) + Math.pow(getTinggi(), 2) ) );
	}
}

class SegitigaSamaSisi extends Segitiga
{
        @Override
	void keliling()
	{
		System.out.println(getAlas() * 3);
	}
}