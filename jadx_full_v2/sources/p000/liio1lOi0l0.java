            package p000;

            import android.os.Build;
            import com.google.android.libraries.intelligence.acceleration.AndroidSystemDetectionJNI;
            import java.lang.invoke.VarHandle;
            
            public abstract class liio1lOi0l0 {
                public static final iOlOOO1 I00000oIO() {
                    ii1lIlI0 ii1lili0I00111O;
/* 1 */             iiilOo0lill iiiloo0lillI001IIilI0O = iiiliI1oIii0.I001IIilI0O();
/* 5 */             String str = Build.VERSION.SDK;
/* 7 */             iiiloo0lillI001IIilI0O.I0001Ioi1lo();
/* 14 */            iiiliI1oIii0.I001l0I00((iiiliI1oIii0) iiiloo0lillI001IIilI0O.I00iiI);
/* 17 */            String str2 = Build.TYPE;
/* 19 */            iiiloo0lillI001IIilI0O.I0001Ioi1lo();
/* 26 */            iiiliI1oIii0.I001lIiIIo1O((iiiliI1oIii0) iiiloo0lillI001IIilI0O.I00iiI);
/* 29 */            String str3 = Build.ID;
/* 31 */            iiiloo0lillI001IIilI0O.I0001Ioi1lo();
/* 38 */            iiiliI1oIii0.I001lloI((iiiliI1oIii0) iiiloo0lillI001IIilI0O.I00iiI);
/* 41 */            int i = Build.VERSION.PREVIEW_SDK_INT;
/* 43 */            iiiloo0lillI001IIilI0O.I0001Ioi1lo();
/* 3 */             ((iiiliI1oIii0) iiiloo0lillI001IIilI0O.I00iiI).zzf = Build.VERSION.PREVIEW_SDK_INT;
/* 53 */            iiillIOI0i1I iiillioi0i1iI001IIilI0O = iiillii1o.I001IIilI0O();
/* 61 */            iiiliI1oIii0 iiilii1oiii0 = (iiiliI1oIii0) iiiloo0lillI001IIilI0O.I0000Il00O();
/* 63 */            iiillioi0i1iI001IIilI0O.I0001Ioi1lo();
/* 70 */            iiillii1o.I001iOo1i0O((iiillii1o) iiillioi0i1iI001IIilI0O.I00iiI, iiilii1oiii0);
/* 73 */            iiilo0I1Ool iiilo0i1oolI00111O = iiiloiIlo0o.I00111O();
/* 77 */            String str4 = Build.DEVICE;
/* 79 */            iiilo0i1oolI00111O.I0001Ioi1lo();
/* 86 */            iiiloiIlo0o.I001lIiIIo1O((iiiloiIlo0o) iiilo0i1oolI00111O.I00iiI);
/* 89 */            String str5 = Build.PRODUCT;
/* 91 */            iiilo0i1oolI00111O.I0001Ioi1lo();
/* 98 */            iiiloiIlo0o.I00II0Ol1O0l((iiiloiIlo0o) iiilo0i1oolI00111O.I00iiI);
/* 101 */           String str6 = Build.MODEL;
/* 103 */           iiilo0i1oolI00111O.I0001Ioi1lo();
/* 110 */           iiiloiIlo0o.I00II0oii1o((iiiloiIlo0o) iiilo0i1oolI00111O.I00iiI);
/* 113 */           String str7 = Build.MANUFACTURER;
/* 115 */           iiilo0i1oolI00111O.I0001Ioi1lo();
/* 122 */           iiiloiIlo0o.I001lllioOl((iiiloiIlo0o) iiilo0i1oolI00111O.I00iiI);
/* 125 */           String str8 = Build.BRAND;
/* 127 */           iiilo0i1oolI00111O.I0001Ioi1lo();
/* 134 */           iiiloiIlo0o.I001lloI((iiiloiIlo0o) iiilo0i1oolI00111O.I00iiI);
/* 141 */           iiiloiIlo0o iiiloiilo0o = (iiiloiIlo0o) iiilo0i1oolI00111O.I0000Il00O();
/* 143 */           iiillioi0i1iI001IIilI0O.I0001Ioi1lo();
/* 150 */           iiillii1o.I001i1lo1io((iiillii1o) iiillioi0i1iI001IIilI0O.I00iiI, iiiloiilo0o);
/* 153 */           byte[] bArrGetDeviceInfo = AndroidSystemDetectionJNI.GetDeviceInfo();
/* 157 */           iiI0lOl iii0lolI00111O = null;
/* 158 */           if (bArrGetDeviceInfo == null) {
/* 160 */               ii1lili0I00111O = null;
                    } else {
                        try {
/* 162 */                   ii0II11oi0I ii0ii11oi0i = ii0II11oi0I.I00000oOI;
/* 164 */                   ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
/* 168 */                   ii1lili0I00111O = ii1lIlI0.I00111O(bArrGetDeviceInfo, ii0II11oi0I.I0000Il00O);
                        } catch (ii0iI11ol e) {
/* 541 */                   throw new IOiIIo1l(ii1lIlI0.class.getName(), e);
                        }
                    }
/* 172 */           String strI001IIilI0O = ii1lili0I00111O.I001IIilI0O();
/* 176 */           iiillioi0i1iI001IIilI0O.I0001Ioi1lo();
/* 183 */           iiillii1o.I001l0I00((iiillii1o) iiillioi0i1iI001IIilI0O.I00iiI, strI001IIilI0O);
/* 190 */           iiillii1o iiillii1oVar = (iiillii1o) iiillioi0i1iI001IIilI0O.I0000Il00O();
/* 192 */           byte[] bArrGetNNAPIInfo = AndroidSystemDetectionJNI.GetNNAPIInfo();
/* 196 */           if (bArrGetNNAPIInfo != null) {
                        try {
/* 199 */                   ii0II11oi0I ii0ii11oi0i2 = ii0II11oi0I.I00000oOI;
/* 201 */                   ii0oIOiIl ii0oioiil2 = ii0oIOiIl.I0000Il00O;
/* 205 */                   iii0lolI00111O = iiI0lOl.I00111O(bArrGetNNAPIInfo, ii0II11oi0I.I0000Il00O);
                        } catch (ii0iI11ol e2) {
/* 328 */                   throw new IOiIIo1l(iiI0lOl.class.getName(), e2);
                        }
                    }
/* 209 */           iiiolIOO1o iiiolioo1oI00111O = iiiooOiO01i.I00111O();
/* 225 */           for (iiI0ili iii0ili : iii0lolI00111O.I001IIilI0O()) {
/* 233 */               iiioOllilIOo iiioolliliooI001IIilI0O = iiioOo0.I001IIilI0O();
/* 237 */               String strI001IIilI0O2 = iii0ili.I001IIilI0O();
/* 241 */               iiioolliliooI001IIilI0O.I0001Ioi1lo();
/* 248 */               iiioOo0.I001i1lo1io((iiioOo0) iiioolliliooI001IIilI0O.I00iiI, strI001IIilI0O2);
/* 251 */               String strI001IO000 = iii0ili.I001IO000();
/* 255 */               iiioolliliooI001IIilI0O.I0001Ioi1lo();
/* 262 */               iiioOo0.I001iOo1i0O((iiioOo0) iiioolliliooI001IIilI0O.I00iiI, strI001IO000);
/* 269 */               int iI00111O = (int) iii0ili.I00111O();
/* 270 */               iiioolliliooI001IIilI0O.I0001Ioi1lo();
/* 1 */                 ((iiioOo0) iiioolliliooI001IIilI0O.I00iiI).zzf = iI00111O;
/* 284 */               iiioOo0 iiiooo0 = (iiioOo0) iiioolliliooI001IIilI0O.I0000Il00O();
/* 286 */               iiiolioo1oI00111O.I0001Ioi1lo();
/* 293 */               iiiooOiO01i.I001IO000((iiiooOiO01i) iiiolioo1oI00111O.I00iiI, iiiooo0);
                    }
/* 301 */           iiiooOiO01i iiioooio01i = (iiiooOiO01i) iiiolioo1oI00111O.I0000Il00O();
/* 305 */           iOlOOO1 iolooo1 = new iOlOOO1();
/* 308 */           iolooo1.I00000oIO = iiillii1oVar;
/* 310 */           iolooo1.I00000oOI = iiioooio01i;
/* 312 */           VarHandle.storeStoreFence();
/* 315 */           return iolooo1;
                }
            }
