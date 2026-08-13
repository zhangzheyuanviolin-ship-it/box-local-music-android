            package p000;

            import android.os.StatFs;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
            public final class Iii1lIOoO {
                public OO0IIO1Il I00000oIO;
                public O0IO0I I00000oOI;
                public double I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public Ii1oo1ooill0 I0001Ioi1lo;

                public final OOllIO I00000oIO() {
                    long jI0000O;
/* 1 */             double d = this.I0000Il00O;
/* 3 */             OO0IIO1Il oO0IIO1Il = this.I00000oIO;
/* 6 */             if (oO0IIO1Il == null) {
/* 164 */               I000II.I001IO000("directory == null");
/* 5 */                 return null;
                    }
/* 14 */            if (d > 0.0d) {
                        try {
/* 16 */                    File file = oO0IIO1Il.toFile();
/* 20 */                    file.mkdir();
/* 29 */                    StatFs statFs = new StatFs(file.getAbsolutePath());
/* 49 */                    jI0000O = lIiioliIlo.I0000O((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.I0000O, this.I0000oI00);
                        } catch (Exception unused) {
/* 54 */                    jI0000O = this.I0000O;
                        }
                    } else {
/* 57 */                jI0000O = 0;
                    }
/* 60 */            O0IO0I o0io0i = this.I00000oOI;
/* 62 */            Ii1oo1ooill0 ii1oo1ooill0 = this.I0001Ioi1lo;
/* 64 */            OOllIO oOllIO = new OOllIO();
/* 67 */            oOllIO.I00000oIO = o0io0i;
/* 71 */            IiiI0l01O iiiI0l01O = new IiiI0l01O();
/* 74 */            iiiI0l01O.I00iOIl = oO0IIO1Il;
/* 76 */            iiiI0l01O.I00iiI = jI0000O;
/* 80 */            if (jI0000O <= 0) {
/* 158 */               I000II.I000iOII("maxSize <= 0");
/* 5 */                 return null;
                    }
/* 88 */            iiiI0l01O.I00iiO = oO0IIO1Il.I0000O("journal");
/* 96 */            iiiI0l01O.I00iio = oO0IIO1Il.I0000O("journal.tmp");
/* 104 */           iiiI0l01O.I00ilI0I1 = oO0IIO1Il.I0000O("journal.bkp");
/* 115 */           iiiI0l01O.I00ilO0 = new LinkedHashMap(0, 0.75f, true);
/* 133 */           iiiI0l01O.I00io1l = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(lOi1li0o0.I00000oIO(), ii1oo1ooill0.I00ooIo0(1)));
/* 137 */           Iii1ooOoII iii1ooOoII = new Iii1ooOoII();
/* 140 */           iii1ooOoII.I00iiI = o0io0i;
/* 142 */           VarHandle.storeStoreFence();
/* 145 */           iiiI0l01O.I00o0l1o1o0 = iii1ooOoII;
/* 147 */           VarHandle.storeStoreFence();
/* 150 */           oOllIO.I00000oOI = iiiI0l01O;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           return oOllIO;
                }
            }
