            package p000;

            import android.util.Log;
            import java.io.File;
            import java.io.FileInputStream;
            import java.util.Iterator;
            
            public final class OIO1o0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public FileInputStream I00iiI;
                public int I00iiO;
                public final OIOI0I I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OIO1o0(OIOI0I oioi0i, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = oioi0i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OIOI0I oioi0i = this.I00iio;
                    switch (i) {
                        case 0:
/* 18 */                    return new OIO1o0(oioi0i, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new OIO1o0(oioi0i, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((OIO1o0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    FileInputStream fileInputStream;
                    FileInputStream fileInputStream2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             OIOI0I oioi0i = this.I00iio;
                    switch (i) {
                        case 0:
/* 124 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 126 */                   int i2 = this.I00iiO;
/* 128 */                   if (i2 == 0) {
/* 145 */                       lIoii1l01l0i.I00000oOI(obj);
                                try {
/* 156 */                           File file = new File(oioi0i.I00000oIO.getFilesDir(), "scheduled_notifications.pb");
/* 163 */                           if (!file.exists()) {
/* 211 */                               return ooiIlOl1iI;
                                    }
/* 167 */                           FileInputStream fileInputStream3 = new FileInputStream(file);
                                    try {
/* 170 */                               OiOI1ilolii1 oiOI1ilolii1 = OiOI1ilolii1.I00000oIO;
/* 172 */                               this.I00iiI = fileInputStream3;
/* 174 */                               this.I00iiO = 1;
/* 176 */                               obj = oiOI1ilolii1.I00000oOI(fileInputStream3);
/* 180 */                               if (obj == ii0111o) {
/* 182 */                                   return ii0111o;
                                        }
/* 184 */                               fileInputStream = fileInputStream3;
                                    } catch (Throwable th) {
/* 203 */                               th = th;
/* 204 */                               fileInputStream = fileInputStream3;
/* 205 */                               throw th;
                                    }
                                } catch (Exception unused) {
/* 211 */                           return ooiIlOl1iI;
                                }
                            } else {
/* 130 */                       if (i2 != 1) {
/* 140 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 132 */                       fileInputStream = this.I00iiI;
                                try {
/* 134 */                           lIoii1l01l0i.I00000oOI(obj);
                                } catch (Throwable th2) {
/* 138 */                           th = th2;
                                    try {
/* 205 */                               throw th;
                                    } finally {
                                    }
                                }
                            }
/* 185 */                   OiOI0o10 oiOI0o10 = (OiOI0o10) obj;
/* 187 */                   ii1OOii.I00000oIO(fileInputStream, null);
/* 190 */                   OlO0OIIl1 olO0OIIl1 = oioi0i.I0000oI00;
/* 192 */                   Iool1IOO1o0i iool1IOO1o0iI00111O = oiOI0o10.I00111O();
/* 196 */                   olO0OIIl1.getClass();
/* 199 */                   olO0OIIl1.I000lI(null, iool1IOO1o0iI00111O);
/* 211 */                   return ooiIlOl1iI;
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiO;
                            try {
/* 20 */                        if (i3 == 0) {
/* 37 */                            lIoii1l01l0i.I00000oOI(obj);
/* 48 */                            File file2 = new File(oioi0i.I00000oIO.getFilesDir(), "scheduled_notifications.pb");
/* 55 */                            if (!file2.exists()) {
/* 123 */                               return ooiIlOl1iI;
                                    }
/* 59 */                            FileInputStream fileInputStream4 = new FileInputStream(file2);
                                    try {
/* 62 */                                OiOI1ilolii1 oiOI1ilolii12 = OiOI1ilolii1.I00000oIO;
/* 64 */                                this.I00iiI = fileInputStream4;
/* 66 */                                this.I00iiO = 1;
/* 68 */                                obj = oiOI1ilolii12.I00000oOI(fileInputStream4);
/* 72 */                                if (obj == ii0111o2) {
/* 74 */                                    return ii0111o2;
                                        }
/* 76 */                                fileInputStream2 = fileInputStream4;
                                    } catch (Throwable th3) {
/* 108 */                               th = th3;
/* 109 */                               fileInputStream2 = fileInputStream4;
/* 110 */                               throw th;
                                    }
                                } else {
/* 22 */                            if (i3 != 1) {
/* 32 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                                return null;
                                    }
/* 24 */                            fileInputStream2 = this.I00iiI;
                                    try {
/* 26 */                                lIoii1l01l0i.I00000oOI(obj);
                                    } catch (Throwable th4) {
/* 30 */                                th = th4;
                                        try {
/* 110 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
/* 77 */                        OiOI0o10 oiOI0o102 = (OiOI0o10) obj;
/* 79 */                        ii1OOii.I00000oIO(fileInputStream2, null);
/* 86 */                        Iterator it = oiOI0o102.I00111O().iterator();
/* 94 */                        while (it.hasNext()) {
/* 102 */                           oioi0i.I00000oOI((OiO1o1il0) it.next());
                                }
/* 123 */                       return ooiIlOl1iI;
                            } catch (Exception e) {
/* 120 */                       Log.e(oioi0i.I0000Il00O, "Failed to reschedule notifications", e);
/* 123 */                       return ooiIlOl1iI;
                            }
                    }
                }
            }
