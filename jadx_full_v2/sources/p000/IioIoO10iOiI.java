            package p000;

            import android.os.Bundle;
            import android.util.Log;
            import com.google.firebase.concurrent.ExecutorsRegistrar;
            import com.google.firebase.installations.FirebaseInstallationsRegistrar;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class IioIoO10iOiI implements IioIllI11l0I, IOiOiIIiii1, IOoillilli, Il10iOl, OOIOo1iOI, O0OI1I001l0l {
                public final int I00iOIl;

                public IioIoO10iOiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static void I0000oI00(int i) {
/* 49 */            throw new OoiIoIoIIO(Oi010OO0.I000oI1ioi(i, "An unknown field for index "));
                }

                public static void I0001Ioi1lo(int i, String str) {
/* 89 */            throw new IllegalArgumentException(str + i);
                }

                public static void I000II(Object obj, Object obj2) {
/* 89 */            throw new OliiO00oOi0("Fragment " + obj + obj2);
                }

                public static void I000O01llI0(Object obj, String str, Object obj2) {
/* 215 */           throw new IllegalStateException(str + obj + obj2);
                }

                public static void I000OOo1O(String str) throws IOException {
/* 49 */            throw new IOException(str);
                }

                public static void I000OiO(String str, Object obj) {
/* 89 */            throw new IllegalArgumentException(str + obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void I000iOII(String str, Object obj, Object obj2, Object obj3, int i) {
/* 966 */           throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
                }

                public static void I000l1(String str, Object obj, Throwable th) {
/* 215 */           throw new SecurityException(str + obj, th);
                }

                public static void I000lI(Throwable th) {
/* 49 */            throw new RuntimeException(th);
                }

                public static void I000o00OoI0I(Object obj, Object obj2) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(obj);
/* 9 */             sb.append(obj2);
/* 89 */            throw new IllegalArgumentException(sb.toString().toString());
                }

                public static void I000oI1ioi(String str) throws GeneralSecurityException {
/* 49 */            throw new GeneralSecurityException(str);
                }

                @Override
                public float I00000oIO(float f) {
                    float f2;
                    float f3;
                    switch (this.I00iOIl) {
                        case 0:
/* 14 */                    if (f < 0.36363637f) {
/* 17 */                        return 7.5625f * f * f;
                            }
/* 24 */                    if (f < 0.72727275f) {
/* 29 */                        float f4 = f - 0.54545456f;
/* 31 */                        f2 = 7.5625f * f4 * f4;
/* 32 */                        f3 = 0.75f;
                            } else if (f < 0.90909094f) {
/* 46 */                        float f5 = f - 0.8181818f;
/* 48 */                        f2 = 7.5625f * f5 * f5;
/* 49 */                        f3 = 0.9375f;
                            } else {
/* 55 */                        float f6 = f - 0.95454544f;
/* 57 */                        f2 = 7.5625f * f6 * f6;
/* 58 */                        f3 = 0.984375f;
                            }
/* 34 */                    return f2 + f3;
                        default:
/* 6 */                     return f;
                    }
                }

                @Override
                public l0il1i0011O I00000oOI(Oili0i1IOo oili0i1IOo) throws GeneralSecurityException {
/* 1 */             OOi1OoI0loOi oOi1OoI0loOi = (OOi1OoI0loOi) oili0i1IOo;
/* 12 */            if (!oOi1OoI0loOi.I00000oIO.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
/* 163 */               I000II.I000iOII("Wrong type URL in call to HmacProtoSerialization.parseKey");
/* 11 */                return null;
                    }
                    try {
/* 20 */                Io1lI0 io1lI0I00II0Ol1O0l = Io1lI0.I00II0Ol1O0l(oOi1OoI0loOi.I0000Il00O, Il1llO11O.I00000oIO());
/* 28 */                if (io1lI0I00II0Ol1O0l.I001lllioOl() != 0) {
/* 154 */                   throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
/* 32 */                o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 35 */                o01l1iooo0.I00iOIl = null;
/* 37 */                o01l1iooo0.I00iiI = null;
/* 39 */                o01l1iooo0.I00iiO = null;
/* 43 */                o01l1iooo0.I00iio = Io1lOlI.I0001Ioi1lo;
/* 57 */                o01l1iooo0.I00iOIl = Integer.valueOf(io1lI0I00II0Ol1O0l.I001l0I00().size());
/* 71 */                o01l1iooo0.I00iiI = Integer.valueOf(io1lI0I00II0Ol1O0l.I001lIiIIo1O().I001lIiIIo1O());
/* 85 */                o01l1iooo0.I00iiO = Io1lilllio1.I00000oIO(io1lI0I00II0Ol1O0l.I001lIiIIo1O().I001l0I00());
/* 93 */                o01l1iooo0.I00iio = Io1lilllio1.I00000oOI(oOi1OoI0loOi.I0000oI00);
/* 95 */                Io1li0o io1li0oI00000oOI = o01l1iooo0.I00000oOI();
/* 103 */               IOO000ilo iOO000ilo = new IOO000ilo(16);
/* 106 */               iOO000ilo.I00iiO = null;
/* 108 */               iOO000ilo.I00iio = null;
/* 110 */               iOO000ilo.I00iiI = io1li0oI00000oOI;
/* 122 */               IIOIlli0IO iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(io1lI0I00II0Ol1O0l.I001l0I00().I000OiO());
/* 128 */               O1OIll00i o1OIll00i = new O1OIll00i(22);
/* 131 */               o1OIll00i.I00iiI = iIOIlli0IOI00000oIO;
/* 133 */               VarHandle.storeStoreFence();
/* 136 */               iOO000ilo.I00iiO = o1OIll00i;
/* 140 */               iOO000ilo.I00iio = oOi1OoI0loOi.I0001Ioi1lo;
/* 142 */               return iOO000ilo.I000iOII();
                    } catch (O000oiiiOI0 | IllegalArgumentException unused) {
/* 157 */               I000oI1ioi("Parsing HmacKey failed");
/* 11 */                return null;
                    }
                }

                @Override
                public Object I0000Il00O(l0il1i0011O l0il1i0011o) throws GeneralSecurityException {
/* 5 */             IOIIl1O00 iOIIl1O00 = new IOIIl1O00();
/* 13 */            if (Oi010OO0.I0001Ioi1lo(2)) {
/* 15 */                return iOIIl1O00;
                    }
/* 18 */            I000oI1ioi("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
/* 21 */            return null;
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) throws IOException {
                    int i;
                    Object obj;
                    switch (this.I00iOIl) {
                        case 7:
/* 154 */                   i = 403;
                            break;
                        case 8:
/* 148 */                   i = -1;
                            break;
                        default:
/* 8 */                     o0IiOl o0iiol = (o0IiOl) oloIIoII1oo;
                            synchronized (o0iiol.I00000oIO) {
/* 17 */                        lII0I0I000I.I000OOo1O("Task is not yet complete", o0iiol.I0000Il00O);
/* 22 */                        if (o0iiol.I0000O) {
/* 145 */                           throw new CancellationException("Task is already canceled.");
                                }
/* 26 */                        boolean zIsInstance = IOException.class.isInstance(o0iiol.I0001Ioi1lo);
/* 30 */                        Exception exc = o0iiol.I0001Ioi1lo;
/* 32 */                        if (zIsInstance) {
/* 137 */                           throw ((Throwable) IOException.class.cast(exc));
                                }
/* 34 */                        if (exc != null) {
/* 130 */                           throw new OiII01(exc);
                                }
/* 36 */                        obj = o0iiol.I0000oI00;
                            }
/* 39 */                    Bundle bundle = (Bundle) obj;
/* 44 */                    if (bundle == null) {
/* 119 */                       I000OOo1O("SERVICE_NOT_AVAILABLE");
/* 43 */                        return null;
                            }
/* 48 */                    String string = bundle.getString("registration_id");
/* 52 */                    if (string != null || (string = bundle.getString("unregistered")) != null) {
/* 54 */                        return string;
                            }
/* 67 */                    String string2 = bundle.getString("error");
/* 77 */                    if ("RST".equals(string2)) {
/* 115 */                       I000OOo1O("INSTANCE_ID_RESET");
/* 43 */                        return null;
                            }
/* 79 */                    if (string2 != null) {
/* 81 */                        I000OOo1O(string2);
/* 43 */                        return null;
                            }
/* 106 */                   Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
/* 109 */                   I000OOo1O("SERVICE_NOT_AVAILABLE");
/* 43 */                    return null;
                    }
/* 149 */           return Integer.valueOf(i);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
                    switch (this.I00iOIl) {
                        case 3:
/* 42 */                    return (ScheduledExecutorService) ExecutorsRegistrar.I00000oIO.get();
                        case 4:
/* 33 */                    return (ScheduledExecutorService) ExecutorsRegistrar.I0000Il00O.get();
                        case 5:
/* 24 */                    return (ScheduledExecutorService) ExecutorsRegistrar.I00000oOI.get();
                        case 6:
/* 13 */                    O0ioIo1O0lO o0ioIo1O0lO = ExecutorsRegistrar.I00000oIO;
/* 15 */                    return Ooi1oi1ii.I00iOIl;
                        default:
/* 1 */                     return FirebaseInstallationsRegistrar.lambda$getComponents$0((I1ii1o0) iOiOIoiiO0i);
                    }
                }
            }
