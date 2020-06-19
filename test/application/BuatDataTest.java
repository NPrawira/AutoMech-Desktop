package application;

import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.IsAnything;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class BuatDataTest {
    
    public BuatDataTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Ignore
    public void testMontirAllData() {
        System.out.println("montirAllData");
        BuatData instance = new BuatData();
        instance.montirAllData();
    }

    @Ignore
    public void testSetIDMontir() {
        System.out.println("setIDMontir");
        BuatData instance = new BuatData();
        instance.setIDMontir();
    }
    
    @Test
    public void idPemilik(){
        BuatData bd = new BuatData();
        String noid = bd.noid("09876543210");
        String exp = "09876543210";
        if(!noid.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("No. ID = " + noid);
        }
        assertThat(noid, allOf((IsAnything.anything()),is(notNullValue())));
        assertEquals(exp, noid);
    }
    
    @Test
    public void tipeId(){
        BuatData bd = new BuatData();
        String tipeid = bd.tipeid("SIM");
        String exp = "SIM";
        if(!tipeid.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Tipe ID = " + tipeid);
        }
        assertThat(tipeid, anyOf((containsString("KTP")),
                (containsString("SIM")),(containsString("STNK")),
                (containsString("Paspor"))),is(notNullValue()));
        assertEquals(exp, tipeid);
    }
    
    @Test
    public void nama(){
        BuatData bd = new BuatData();
        String nama = bd.nama("Naufal");
        String exp = "Naufal";
        if(!nama.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Nama = " + nama);
        }
        assertThat(nama, allOf((IsAnything.anything()),is(notNullValue())));
        assertEquals(exp, nama);
    }
    
    @Test
    public void alamat(){
        BuatData bd = new BuatData();
        String alamat = bd.alamat("Jln. Kalibata");
        String exp = "Jln. Kalibata";
        if(!alamat.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Alamat = " + alamat);
        }
        assertThat(alamat, anyOf(startsWith("Jl."),startsWith("Jln."),
                startsWith("Jalan")),is(notNullValue()));
        assertEquals(exp, alamat);
    }
    
    @Test
    public void noTel(){
        BuatData bd = new BuatData();
        String notel = bd.notel("089876543210");
        String exp = "089876543210";
        if(!notel.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("No. Telepon = " + notel);
        }
        assertThat(notel, anyOf(containsString("0"),containsString("1"),
                containsString("2"),containsString("3"),containsString("4"),
                containsString("5"),containsString("6"),containsString("7"),
                containsString("8"),containsString("9")),is(notNullValue()));
        assertEquals(exp, notel);
    }
    
    @Test
    public void platNo(){
        BuatData bd = new BuatData();
        String platno = bd.platno("B5678GO");
        String exp = "B5678GO";
        if(!platno.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Plat Nomor = " + platno);
        }
        assertThat(platno, anyOf(IsAnything.anything()),is(notNullValue()));
        assertEquals(exp, platno);
    }
    
    @Test
    public void jenisMotor(){
        BuatData bd = new BuatData();
        String jenismotor = bd.jenismotor("Matik");
        String exp = "Matik";
        if(!jenismotor.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Jenis Motor = " + jenismotor);
        }
        assertThat(jenismotor, anyOf((containsString("Bebek")),
                (containsString("Matik")),(containsString("Sport"))),
                is(notNullValue()));
        assertEquals(exp, jenismotor);
    }
    
    @Test
    public void merek(){
        BuatData bd = new BuatData();
        String merek = bd.merek("Yamaha");
        String exp = "Yamaha";
        if(!merek.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Merek = " + merek);
        }
        assertThat(merek, anyOf(containsString("Honda"),
                containsString("Yamaha"),containsString("Vespa")),
                is(notNullValue()));
        assertEquals(exp, merek);
    }
    
    @Test
    public void model(){
        BuatData bd = new BuatData();
        String model = bd.model("Nmax");
        String exp = "Nmax";
        if(!model.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Model = " + model);
        }
        assertThat(model, allOf(IsAnything.anything(),is(notNullValue())));
        assertEquals(exp, model);
    }
    
    @Test
    public void kilometer(){
        BuatData bd = new BuatData();
        String kilometer = bd.kilometer("500");
        String exp = "500";
        if(!kilometer.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Kilometer = " + kilometer);
        }
        assertThat(kilometer, anyOf(containsString("0"),containsString("1"),
                containsString("2"),containsString("3"),containsString("4"),
                containsString("5"),containsString("6"),containsString("7"),
                containsString("8"),containsString("9")),is(notNullValue()));
        assertEquals(exp, kilometer);
    }
    
    @Test
    public void notaNo(){
        BuatData bd = new BuatData();
        String notano = bd.notano("N001");
        String exp = "N001";
        if(!notano.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Nota No. = " + notano);
        }
        assertThat(notano, allOf(startsWith("N"),is(notNullValue())));
        assertEquals(exp, notano);
    }
    
    @Test
    public void idMontir(){
        BuatData bd = new BuatData();
        String idmontir = bd.idmontir("M001");
        String exp = "M001";
        if(!idmontir.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("ID Montir = " + idmontir);
        }
        assertThat(idmontir, allOf(startsWith("M"),is(notNullValue())));
        assertEquals(exp, idmontir);
    }
    
    @Test
    public void keluhan(){
        BuatData bd = new BuatData();
        String keluhan = bd.keluhan("Mati");
        String exp = "Mati";
        if(!keluhan.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Keluhan = " + keluhan);
        }
        assertThat(keluhan, allOf(IsAnything.anything(),is(notNullValue())));
        assertEquals(exp, keluhan);
    }
    
    @Test
    public void catatanServis(){
        BuatData bd = new BuatData();
        String catatanservis = bd.catatanservis("Hidup");
        String exp = "Hidup";
        if(!catatanservis.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Catatan Servis = " + catatanservis);
        }
        assertThat(catatanservis, IsAnything.anything());
        assertEquals(exp, catatanservis);
    }
    
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BuatData.main(args);
    }
    
}
