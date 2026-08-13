            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.security.NoSuchAlgorithmException;
            
            public final class i0OIlO {
                public static final OlOilIlol1 I00000oOI = new OlOilIlol1("VerifySliceTaskHandler");
                public i0Il00O1 I00000oIO;

                public final void I00000oIO(i0OIl0l0000O i0oil0l0000o) {
/* 3 */             String str = (String) i0oil0l0000o.I00000oOI;
/* 5 */             i0Il00O1 i0il00o1 = this.I00000oIO;
/* 9 */             String str2 = (String) i0oil0l0000o.I00000oOI;
/* 11 */            String str3 = i0oil0l0000o.I0000oI00;
/* 13 */            int i = i0oil0l0000o.I00000oIO;
/* 19 */            File fileI000l1 = i0il00o1.I000l1(str2, i0oil0l0000o.I0000Il00O, i0oil0l0000o.I0000O, str3);
/* 29 */            if (!fileI000l1.exists()) {
/* 966 */               throw new i0O0lI1oiO(IlIi0I0.I000lI("Cannot find unverified files for slice ", str3, "."), i);
                    }
                    try {
/* 33 */                i0Il00O1 i0il00o12 = this.I00000oIO;
/* 35 */                String str4 = i0oil0l0000o.I0000oI00;
/* 37 */                int i2 = i0oil0l0000o.I0000Il00O;
/* 39 */                long j = i0oil0l0000o.I0000O;
/* 41 */                i0il00o12.getClass();
/* 64 */                File file = new File(new File(new File(i0il00o12.I0000Il00O(i2, j, str), "_slices"), "_metadata"), str4);
/* 71 */                if (!file.exists()) {
/* 206 */                   throw new i0O0lI1oiO("Cannot find metadata files for slice " + str4 + ".", i);
                        }
                        try {
/* 87 */                    if (!liO111OO1.I00000oIO(i0OIioiOOiiO.I00000oIO(fileI000l1, file)).equals(i0oil0l0000o.I0001Ioi1lo)) {
/* 158 */                       throw new i0O0lI1oiO(IlIi0I0.I000lI("Verification failed for slice ", str4, "."), i);
                            }
/* 97 */                    I00000oOI.I0000O("Verification of slice %s of pack %s successful.", str4, str);
/* 113 */                   File fileI000lI = this.I00000oIO.I000lI((String) i0oil0l0000o.I00000oOI, i0oil0l0000o.I0000Il00O, i0oil0l0000o.I0000O, i0oil0l0000o.I0000oI00);
/* 121 */                   if (!fileI000lI.exists()) {
/* 123 */                       fileI000lI.mkdirs();
                            }
/* 130 */                   if (!fileI000l1.renameTo(fileI000lI)) {
/* 146 */                       throw new i0O0lI1oiO(IlIi0I0.I000lI("Failed to move slice ", str3, " after verification."), i);
                            }
                        } catch (IOException e) {
/* 172 */                   throw new i0O0lI1oiO(i, e, IlIi0I0.I000lI("Could not digest file during verification for slice ", str3, "."));
                        } catch (NoSuchAlgorithmException e2) {
/* 182 */                   throw new i0O0lI1oiO(i, e2, "SHA256 algorithm not supported.");
                        }
                    } catch (IOException e3) {
/* 218 */               throw new i0O0lI1oiO(i, e3, IlIi0I0.I000lI("Could not reconstruct slice archive during verification for slice ", str3, "."));
                    }
                }
            }
