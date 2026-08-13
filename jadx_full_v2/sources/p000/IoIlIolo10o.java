            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public class IoIlIolo10o implements Ii0110 {
                public static final AtomicIntegerFieldUpdater I00iio;
                public static final I1OoollI1Il1 I00ilI0I1;
                public static final long I00ilO0;
                public final IoIlI1oli I00iOIl;
                public IoO10Iooo0 I00iiI;
                public Ii1olII1lO1 I00iiO;
                private volatile int received = 0;

                static {
                    O0O01O0o o0O01O0oI00000oIO;
/* 5 */             O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(Object.class);
                    try {
/* 9 */                 o0O01O0oI00000oIO = OOoOl0i.I00000oIO(Object.class);
                    } catch (Throwable unused) {
/* 14 */                o0O01O0oI00000oIO = null;
                    }
/* 27 */            I00ilI0I1 = new I1OoollI1Il1("CustomResponse", new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO));
/* 37 */            I00iio = AtomicIntegerFieldUpdater.newUpdater(IoIlIolo10o.class, "received");
/* 49 */            I00ilO0 = I1Ioolli0l0o.I00000oIO.objectFieldOffset(IoIlIolo10o.class.getDeclaredField("received"));
                }

                public IoIlIolo10o(IoIlI1oli ioIlI1oli) {
/* 4 */             this.I00iOIl = ioIlI1oli;
                }

                @Override
                public final Ii00l101O I00000oIO() {
/* 5 */             return I0000oI00().I00000oIO();
                }

                /* JADX WARN: Code restructure failed: missing block: B:71:0x00f0, code lost:
                
                    if (r14 == r1) goto L72;
                 */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #4 {all -> 0x00a8, blocks: (B:73:0x00f3, B:77:0x0102, B:82:0x0111, B:84:0x011b, B:85:0x0126, B:70:0x00df, B:42:0x008f, B:45:0x00a7, B:64:0x00c4, B:66:0x00d0), top: B:91:0x0021 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(OoOO010 ooOO010, IOoilo iOoilo) throws Throwable {
                    IoIlIiIO ioIlIiIO;
                    Throwable th;
                    IoIlIolo10o ioIlIolo10o;
/* 3 */             if (iOoilo instanceof IoIlIiIO) {
/* 6 */                 ioIlIiIO = (IoIlIiIO) iOoilo;
/* 8 */                 int i = ioIlIiIO.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioIlIiIO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioIlIiIO = new IoIlIiIO(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000O = ioIlIiIO.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioIlIiIO.I00iio;
                    try {
                        try {
                            try {
                                try {
/* 34 */                            if (i2 == 0) {
/* 67 */                                lIoii1l01l0i.I00000oOI(objI0000O);
                                        try {
                                            try {
                                                try {
/* 86 */                                            if (((IOIO10iOi1) ooOO010.I00000oIO).I001l0I00().isInstance(I0000oI00())) {
/* 88 */                                                return I0000oI00();
                                                    }
/* 97 */                                            if (!I0000Il00O()) {
/* 99 */                                                Ii1olII1lO1 ii1olII1lO1I0000oI00 = I0000oI00();
/* 103 */                                               I1OoollI1Il1 i1OoollI1Il1 = IiioIIllI.I00000oIO;
/* 123 */                                               if (!ii1olII1lO1I0000oI00.I00iOIl().getAttributes().I0000Il00O().containsKey(IiioIIllI.I00000oOI)) {
/* 127 */                                                   I00iio.getClass();
                                                            try {
/* 136 */                                                       ioIlIolo10o = this;
                                                                try {
/* 141 */                                                           if (!I1Ioolli0l0o.I00000oIO.compareAndSwapInt(ioIlIolo10o, I00ilO0, 0, 1)) {
/* 146 */                                                               I00OI1 i00oi1 = new I00OI1();
/* 163 */                                                               i00oi1.I00iiI = "Response already received: " + ioIlIolo10o;
/* 165 */                                                               VarHandle.storeStoreFence();
/* 168 */                                                               throw i00oi1;
                                                                    }
                                                                } catch (Throwable th2) {
/* 181 */                                                           th = th2;
/* 175 */                                                           th = th;
/* 307 */                                                           il001oo1.I00000oOI(ioIlIolo10o.I0000oI00(), ilIiOIi0I.I00000oIO("Receive failed", th));
/* 551 */                                                           throw th;
                                                                }
                                                            } catch (Throwable th3) {
/* 183 */                                                       th = th3;
/* 184 */                                                       ioIlIolo10o = this;
                                                            }
                                                        }
/* 203 */                                               objI0000O = ioIlIolo10o.getAttributes().I0000O(I00ilI0I1);
/* 207 */                                               if (objI0000O == null) {
/* 209 */                                                   ioIlIiIO.I00iOIl = ooOO010;
/* 211 */                                                   ioIlIiIO.I00iio = 1;
/* 217 */                                                   objI0000O = ioIlIolo10o.I0000oI00().I0000Il00O();
/* 221 */                                                   if (objI0000O != ii0111o) {
                                                            }
/* 243 */                                                   return ii0111o;
                                                        }
                                                    }
/* 192 */                                           ioIlIolo10o = this;
/* 203 */                                           objI0000O = ioIlIolo10o.getAttributes().I0000O(I00ilI0I1);
/* 207 */                                           if (objI0000O == null) {
                                                    }
                                                } catch (Throwable th4) {
/* 194 */                                           th = th4;
/* 195 */                                           ioIlIolo10o = this;
                                                }
                                            } catch (Throwable th5) {
/* 186 */                                       th = th5;
/* 187 */                                       ioIlIolo10o = this;
                                            }
                                        } catch (Throwable th6) {
/* 189 */                                   th = th6;
/* 190 */                                   ioIlIolo10o = this;
/* 170 */                                   th = th;
/* 307 */                                   il001oo1.I00000oOI(ioIlIolo10o.I0000oI00(), ilIiOIi0I.I00000oIO("Receive failed", th));
/* 551 */                                   throw th;
                                        }
                                    } else {
/* 36 */                                if (i2 != 1) {
/* 38 */                                    if (i2 != 2) {
/* 55 */                                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                                        return null;
                                            }
/* 40 */                                    ooOO010 = ioIlIiIO.I00iOIl;
/* 42 */                                    lIoii1l01l0i.I00000oOI(objI0000O);
/* 45 */                                    ioIlIolo10o = this;
/* 246 */                                   Object obj = ((IoO1o1) objI0000O).I00000oOI;
/* 254 */                                   Object obj2 = O0000Ioio00.I0000O(obj, OIOIIioi.I00000oIO) ? null : obj;
/* 257 */                                   if (obj2 == null || ((IOIO10iOi1) ooOO010.I00000oIO).I001l0I00().isInstance(obj2)) {
/* 296 */                                       return obj2;
                                            }
/* 295 */                                   throw new OIIl1010iii(ioIlIolo10o.I0000oI00(), OOoOl0i.I00000oIO.I00000oOI(obj2.getClass()), ooOO010.I00000oIO);
                                        }
/* 59 */                                ooOO010 = ioIlIiIO.I00iOIl;
/* 61 */                                lIoii1l01l0i.I00000oOI(objI0000O);
/* 64 */                                ioIlIolo10o = this;
                                    }
/* 226 */                           IoO1o1 ioO1o1 = new IoO1o1(ooOO010, objI0000O);
/* 231 */                           IoO0l0Iiioll ioO0l0Iiioll = ioIlIolo10o.I00iOIl.I00ilI0I1;
/* 233 */                           ioIlIiIO.I00iOIl = ooOO010;
/* 235 */                           ioIlIiIO.I00iio = 2;
/* 237 */                           objI0000O = ioO0l0Iiioll.I00000oIO(ioIlIolo10o, ioO1o1, ioIlIiIO);
                                } catch (Throwable th7) {
/* 178 */                           th = th7;
                                }
                            } catch (Throwable th8) {
/* 169 */                       th = th8;
                            }
                        } catch (Throwable th9) {
/* 173 */                   th = th9;
                        }
                    } catch (Throwable th10) {
/* 49 */                th = th10;
/* 50 */                ioIlIolo10o = this;
/* 307 */               il001oo1.I00000oOI(ioIlIolo10o.I0000oI00(), ilIiOIi0I.I00000oIO("Receive failed", th));
/* 551 */               throw th;
                    }
                }

                public boolean I0000Il00O() {
/* 1 */             return false;
                }

                public final IoO10Iooo0 I0000O() {
/* 1 */             IoO10Iooo0 ioO10Iooo0 = this.I00iiI;
/* 3 */             if (ioO10Iooo0 != null) {
/* 5 */                 return ioO10Iooo0;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("request");
/* 29 */            throw null;
                }

                public final Ii1olII1lO1 I0000oI00() {
/* 1 */             Ii1olII1lO1 ii1olII1lO1 = this.I00iiO;
/* 3 */             if (ii1olII1lO1 != null) {
/* 5 */                 return ii1olII1lO1;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("response");
/* 29 */            throw null;
                }

                public final IOlOl10 getAttributes() {
/* 5 */             return I0000O().getAttributes();
                }

                public final String toString() {
/* 40 */            return "HttpClientCall[" + I0000O().getUrl() + ", " + I0000oI00().I0000O() + ']';
                }
            }
