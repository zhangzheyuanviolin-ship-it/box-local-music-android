            package p000;

            import android.os.ParcelFileDescriptor;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.zip.GZIPInputStream;
            
            public final class i0OIIIll {
                public static final OlOilIlol1 I0000Il00O = new OlOilIlol1("PatchSliceTaskHandler");
                public i0Il00O1 I00000oIO;
                public i0IOo0i0 I00000oOI;

                public final void I00000oIO(i0OI1oo1 i0oi1oo1) {
/* 5 */             OlOilIlol1 olOilIlol1 = I0000Il00O;
/* 7 */             i0Il00O1 i0il00o1 = this.I00000oIO;
/* 11 */            String str = (String) i0oi1oo1.I00000oOI;
/* 13 */            int i = i0oi1oo1.I00000oIO;
/* 15 */            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = i0oi1oo1.I000OiO;
/* 17 */            int i2 = i0oi1oo1.I0000Il00O;
/* 19 */            long j = i0oi1oo1.I0000O;
/* 21 */            File fileI000iOII = i0il00o1.I000iOII(i2, j, str);
/* 35 */            File file = new File(i0il00o1.I000iOII(i2, j, str), "_metadata");
/* 38 */            String str2 = i0oi1oo1.I000O01llI0;
/* 40 */            File file2 = new File(file, str2);
                    try {
/* 54 */                InputStream gZIPInputStream = i0oi1oo1.I000II != 2 ? autoCloseInputStream : new GZIPInputStream(autoCloseInputStream, 8192);
                        try {
/* 59 */                    i0Il1IIOi i0il1iioi = new i0Il1IIOi(fileI000iOII, file2);
/* 78 */                    File fileI000l1 = this.I00000oIO.I000l1((String) i0oi1oo1.I00000oOI, i0oi1oo1.I0000oI00, i0oi1oo1.I0001Ioi1lo, i0oi1oo1.I000O01llI0);
/* 86 */                    if (!fileI000l1.exists()) {
/* 88 */                        fileI000l1.mkdirs();
                            }
/* 113 */                   i0OIi1oi0i1 i0oii1oi0i1 = new i0OIi1oi0i1(this.I00000oIO, (String) i0oi1oo1.I00000oOI, i0oi1oo1.I0000oI00, i0oi1oo1.I0001Ioi1lo, i0oi1oo1.I000O01llI0);
/* 118 */                   i0O0oIIlI i0o0oiili = new i0O0oIIlI();
/* 126 */                   i0o0oiili.I00iOIl = new i0O1ilIOoli1();
/* 128 */                   i0o0oiili.I00iiI = fileI000l1;
/* 130 */                   i0o0oiili.I00iiO = i0oii1oi0i1;
/* 132 */                   VarHandle.storeStoreFence();
/* 137 */                   liIliOlIioI.I00000oIO(i0il1iioi, gZIPInputStream, i0o0oiili, i0oi1oo1.I000OOo1O);
/* 141 */                   i0oii1oi0i1.I000O01llI0(0);
/* 144 */                   gZIPInputStream.close();
/* 153 */                   olOilIlol1.I0000O("Patching and extraction finished for slice %s of pack %s.", str2, str);
/* 164 */                   ((i0OiOI1) this.I00000oOI.I0000Il00O()).I0000O(i, 0, str, str2);
                            try {
/* 167 */                       autoCloseInputStream.close();
                            } catch (IOException unused) {
/* 177 */                       olOilIlol1.I0000oI00("Could not close file for slice %s of pack %s.", str2, str);
                            }
                        } finally {
                        }
                    } catch (IOException e) {
/* 202 */               olOilIlol1.I00000oOI("IOException during patching %s.", e.getMessage());
/* 966 */               throw new i0O0lI1oiO(i, e, Oi010OO0.I001IO000("Error patching slice ", str2, " of pack ", str, "."));
                    }
                }
            }
