            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.jvm.functions.Function3;
            import sun.misc.Unsafe;
            
            public abstract class OOiIOI10OOIi {
                public static final AtomicReferenceFieldUpdater I000II;
                public static final AtomicReferenceFieldUpdater I000O01llI0;
                public static final long I000OOo1O;
                public static final long I000OiO;
                public static final long I000iOII;
                public static final long I000l1;
                public Oi00IilOloo0 I00000oIO;
                public Ii10ioolOI I00000oOI;
                public volatile Object I0000Il00O;
                public volatile Object I0000O;
                public volatile Object I0000oI00;
                public volatile Object I0001Ioi1lo;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I000iOII = unsafe.objectFieldOffset(OOiIOI10OOIi.class.getDeclaredField("I0000Il00O"));
/* 27 */            I000OOo1O = unsafe.objectFieldOffset(OOiIOI10OOIi.class.getDeclaredField("I0000O"));
/* 37 */            I000II = AtomicReferenceFieldUpdater.newUpdater(OOiIOI10OOIi.class, Object.class, "I0000oI00");
/* 47 */            I000l1 = unsafe.objectFieldOffset(OOiIOI10OOIi.class.getDeclaredField("I0000oI00"));
/* 55 */            I000O01llI0 = AtomicReferenceFieldUpdater.newUpdater(OOiIOI10OOIi.class, Object.class, "I0001Ioi1lo");
/* 65 */            I000OiO = unsafe.objectFieldOffset(OOiIOI10OOIi.class.getDeclaredField("I0001Ioi1lo"));
                }

                public static Object I0000Il00O(IOIo001i1o iOIo001i1o, IoliIiol1 ioliIiol1, IOIlo0 iOIlo0) throws Throwable {
/* 1 */             O0Iioo1lO0o o0Iioo1lO0o = OOiIOloo0.I00000oIO;
/* 7 */             OIOo1iiI oIOo1iiI = new OIOo1iiI(9);
/* 10 */            oIOo1iiI.I00iiI = ioliIiol1;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            o0Iioo1lO0o.I00000oOI(oIOo1iiI);
/* 18 */            Ii10ioolOI ii10ioolOI = iOIo001i1o.I00000oOI;
/* 21 */            if (ii10ioolOI == null) {
/* 76 */                I000II.I001IO000("Not connected");
/* 20 */                return null;
                    }
/* 23 */            O1llOlOo o1llOlOo = ioliIiol1.I00000oOI;
/* 27 */            if (o1llOlOo == O1llOIO.I00oII) {
/* 31 */                IOIoIIO iOIoIIO = iOIo001i1o.I00100l0.I00000oOI;
/* 45 */                if (!(iOIoIIO != null ? O0000Ioio00.I0000O(iOIoIIO.I00000oIO, Boolean.TRUE) : false)) {
/* 52 */                    IioIoO10iOiI.I000O01llI0(o1llOlOo, "Client does not support roots list changed notifications (required for ", ")");
/* 20 */                    return null;
                        }
                    } else {
/* 56 */                O1llIlI o1llIlI = O1llOIO.Companion;
                    }
/* 62 */            Object objI0001Ioi1lo = ii10ioolOI.I0001Ioi1lo(l0IOoOo0O0O.I00000oIO(ioliIiol1), null, iOIlo0);
                    return objI0001Ioi1lo == Ii0111o.I00iOIl ? objI0001Ioi1lo : OoiIlOl1iI.I00000oIO;
                }

                public abstract void I00000oIO(O1llOlOo o1llOlOo);

                public abstract void I00000oOI(O1llOlOo o1llOlOo);

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(O00i1OoOll1I o00i1OoOll1I, IOoilo iOoilo) throws Throwable {
                    OOiIII00oOol oOiIII00oOol;
/* 1 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             if (iOoilo instanceof OOiIII00oOol) {
/* 8 */                 oOiIII00oOol = (OOiIII00oOol) iOoilo;
/* 10 */                int i = oOiIII00oOol.I00iio;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oOiIII00oOol.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oOiIII00oOol = new OOiIII00oOol(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = oOiIII00oOol.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oOiIII00oOol.I00iio;
                    try {
/* 35 */                if (i2 != 0) {
/* 37 */                    if (i2 != 1) {
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 39 */                    O00i1OoOll1I o00i1OoOll1I2 = oOiIII00oOol.I00iOIl;
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 44 */                    return ooiIlOl1iI;
                        }
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                O0Iioo1lO0o o0Iioo1lO0o = OOiIOloo0.I00000oIO;
/* 61 */                OOiII1001O oOiII1001O = new OOiII1001O(0);
/* 64 */                oOiII1001O.I00iiI = o00i1OoOll1I;
/* 66 */                VarHandle.storeStoreFence();
/* 69 */                o0Iioo1lO0o.I00000oOI(oOiII1001O);
/* 82 */                IlliIl1l11O illiIl1l11O = (IlliIl1l11O) ((Map) this.I0000O).get(o00i1OoOll1I.I00000oIO);
/* 84 */                IlliIl1l11O illiIl1l11O2 = illiIl1l11O != null ? illiIl1l11O : null;
/* 88 */                if (illiIl1l11O2 != null) {
/* 104 */                   oOiIII00oOol.I00iOIl = o00i1OoOll1I;
/* 106 */                   oOiIII00oOol.I00iio = 1;
                            return illiIl1l11O2.invoke(o00i1OoOll1I, oOiIII00oOol) == ii0111o ? ii0111o : ooiIlOl1iI;
                        }
/* 92 */                OOiII1001O oOiII1001O2 = new OOiII1001O(1);
/* 95 */                oOiII1001O2.I00iiI = o00i1OoOll1I;
/* 97 */                VarHandle.storeStoreFence();
/* 100 */               o0Iioo1lO0o.I00000oOI(oOiII1001O2);
/* 103 */               return ooiIlOl1iI;
                    } catch (Throwable th) {
/* 116 */               O0Iioo1lO0o o0Iioo1lO0o2 = OOiIOloo0.I00000oIO;
/* 121 */               OOiII1001O oOiII1001O3 = new OOiII1001O(2);
/* 124 */               oOiII1001O3.I00iiI = o00i1OoOll1I;
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               o0Iioo1lO0o2.I00000oIO(th, oOiII1001O3);
/* 551 */               return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:49:0x00e7, B:51:0x00fc, B:53:0x0102, B:57:0x010b, B:46:0x00d4), top: B:75:0x00d4 }] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0130 A[Catch: all -> 0x013f, TryCatch #4 {all -> 0x013f, blocks: (B:61:0x012c, B:63:0x0130, B:68:0x0144), top: B:79:0x012c }] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x015a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Type inference failed for: r13v15 */
                /* JADX WARN: Type inference failed for: r13v2, types: [O00iOil] */
                /* JADX WARN: Type inference failed for: r13v7 */
                /* JADX WARN: Type inference failed for: r8v0 */
                /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function3] */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function3] */
                /* JADX WARN: Type inference failed for: r8v4 */
                /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function3] */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX WARN: Type inference failed for: r8v7 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(O00iOil o00iOil, IOoilo iOoilo) throws Throwable {
                    OOiIIO0 oOiIIO0;
                    ?? r8;
                    Throwable th;
                    ?? r13;
                    Throwable th2;
                    O00iOil o00iOil2;
                    Ii10ioolOI ii10ioolOI;
                    Ii10ioolOI ii10ioolOI2;
/* 1 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             if (iOoilo instanceof OOiIIO0) {
/* 10 */                oOiIIO0 = (OOiIIO0) iOoilo;
/* 12 */                int i = oOiIIO0.I00ilO0;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    oOiIIO0.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    oOiIIO0 = new OOiIIO0(this, iOoilo);
                        }
                    }
/* 29 */            Object objInvoke = oOiIIO0.I00iio;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = oOiIIO0.I00ilO0;
                    try {
/* 40 */                if (i2 == 0) {
/* 104 */                   lIoii1l01l0i.I00000oOI(objInvoke);
/* 107 */                   O0Iioo1lO0o o0Iioo1lO0o = OOiIOloo0.I00000oIO;
/* 112 */                   OOiII0iO00O oOiII0iO00O = new OOiII0iO00O(0);
/* 115 */                   oOiII0iO00O.I00iiI = o00iOil;
/* 117 */                   VarHandle.storeStoreFence();
/* 120 */                   o0Iioo1lO0o.I00000oOI(oOiII0iO00O);
/* 133 */                   Function3 function3 = (Function3) ((Map) this.I0000Il00O).get(o00iOil.I00000oOI);
/* 135 */                   r8 = function3 != null ? function3 : null;
/* 139 */                   if (r8 == null) {
/* 143 */                       OOiII0iO00O oOiII0iO00O2 = new OOiII0iO00O(1);
/* 146 */                       oOiII0iO00O2.I00iiI = o00iOil;
/* 148 */                       VarHandle.storeStoreFence();
/* 151 */                       o0Iioo1lO0o.I00000oOI(oOiII0iO00O2);
/* 154 */                       Ii10ioolOI ii10ioolOI3 = this.I00000oOI;
/* 156 */                       if (ii10ioolOI3 != null) {
/* 183 */                           O00Ol10IiOoi o00Ol10IiOoi = new O00Ol10IiOoi(o00iOil.I00000oIO, new OOillOoli(-32601, "Server does not support " + o00iOil.I00000oOI));
/* 186 */                           oOiIIO0.I00iOIl = o00iOil;
/* 188 */                           oOiIIO0.I00iiI = r8;
/* 190 */                           oOiIIO0.I00ilO0 = 1;
/* 196 */                           if (ii10ioolOI3.I0001Ioi1lo(o00Ol10IiOoi, null, oOiIIO0) == ii0111o) {
                                    }
                                }
/* 551 */                       return ooiIlOl1iI;
                            }
                            try {
/* 215 */                       Oi0I01oil oi0I01oil = new Oi0I01oil();
/* 218 */                       oOiIIO0.I00iOIl = o00iOil;
/* 220 */                       oOiIIO0.I00iiI = r8;
/* 222 */                       oOiIIO0.I00ilO0 = 2;
/* 224 */                       objInvoke = r8.invoke(o00iOil, oi0I01oil, oOiIIO0);
                                o00iOil = o00iOil;
                            } catch (Throwable th3) {
/* 265 */                       th = th3;
                                r13 = o00iOil;
/* 286 */                       O0Iioo1lO0o o0Iioo1lO0o2 = OOiIOloo0.I00000oIO;
/* 290 */                       OOiII0iO00O oOiII0iO00O3 = new OOiII0iO00O(3);
/* 293 */                       oOiII0iO00O3.I00iiI = r13;
/* 295 */                       VarHandle.storeStoreFence();
/* 298 */                       o0Iioo1lO0o2.I00000oIO(th, oOiII0iO00O3);
/* 301 */                       ii10ioolOI = this.I00000oOI;
/* 303 */                       if (ii10ioolOI != null) {
                                }
/* 551 */                       return ooiIlOl1iI;
                            }
/* 228 */                   if (objInvoke != ii0111o) {
/* 232 */                       Oi0OO01oi oi0OO01oi = (Oi0OO01oi) objInvoke;
/* 234 */                       O0Iioo1lO0o o0Iioo1lO0o3 = OOiIOloo0.I00000oIO;
/* 238 */                       OOiII0iO00O oOiII0iO00O4 = new OOiII0iO00O(2);
/* 241 */                       oOiII0iO00O4.I00iiI = o00iOil;
/* 243 */                       VarHandle.storeStoreFence();
/* 246 */                       o0Iioo1lO0o3.I00000oOI(oOiII0iO00O4);
/* 249 */                       ii10ioolOI2 = this.I00000oOI;
/* 251 */                       if (ii10ioolOI2 != null) {
                                }
/* 551 */                       return ooiIlOl1iI;
                            }
/* 347 */                   return ii0111o;
                        }
/* 42 */                if (i2 == 1) {
/* 98 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 101 */                   return ooiIlOl1iI;
                        }
                        try {
                        } catch (Throwable th4) {
/* 82 */                    th = th4;
/* 83 */                    r8 = o00iOil;
/* 3 */                     r13 = "Server does not support ";
/* 286 */                   O0Iioo1lO0o o0Iioo1lO0o22 = OOiIOloo0.I00000oIO;
/* 290 */                   OOiII0iO00O oOiII0iO00O32 = new OOiII0iO00O(3);
/* 293 */                   oOiII0iO00O32.I00iiI = r13;
/* 295 */                   VarHandle.storeStoreFence();
/* 298 */                   o0Iioo1lO0o22.I00000oIO(th, oOiII0iO00O32);
                            try {
/* 301 */                       ii10ioolOI = this.I00000oOI;
/* 303 */                       if (ii10ioolOI != null) {
/* 307 */                           Oi0IO1ii011 oi0IO1ii011 = r13.I00000oIO;
/* 311 */                           String message = th.getMessage();
/* 315 */                           if (message == null) {
/* 317 */                               message = "Internal error";
                                    }
/* 330 */                           O00Ol10IiOoi o00Ol10IiOoi2 = new O00Ol10IiOoi(oi0IO1ii011, new OOillOoli(-32603, message));
/* 333 */                           oOiIIO0.I00iOIl = r13;
/* 335 */                           oOiIIO0.I00iiI = r8;
/* 337 */                           oOiIIO0.I00iiO = th;
/* 339 */                           oOiIIO0.I00ilO0 = 4;
/* 345 */                           if (ii10ioolOI.I0001Ioi1lo(o00Ol10IiOoi2, null, oOiIIO0) == ii0111o) {
                                    }
                                }
                            } catch (Throwable th5) {
/* 321 */                       O00iOil o00iOil3 = r13;
/* 322 */                       th2 = th5;
/* 323 */                       o00iOil2 = o00iOil3;
/* 348 */                       O0Iioo1lO0o o0Iioo1lO0o4 = OOiIOloo0.I00000oIO;
/* 352 */                       OOiII0iO00O oOiII0iO00O5 = new OOiII0iO00O(4);
/* 355 */                       oOiII0iO00O5.I00iiI = o00iOil2;
/* 357 */                       VarHandle.storeStoreFence();
/* 360 */                       o0Iioo1lO0o4.I00000oIO(th2, oOiII0iO00O5);
/* 551 */                       return ooiIlOl1iI;
                            }
/* 551 */                   return ooiIlOl1iI;
                        }
/* 44 */                if (i2 != 2) {
/* 46 */                    if (i2 == 3) {
/* 74 */                        Function3 function32 = oOiIIO0.I00iiI;
/* 76 */                        O00iOil o00iOil4 = oOiIIO0.I00iOIl;
/* 78 */                        lIoii1l01l0i.I00000oOI(objInvoke);
/* 81 */                        return ooiIlOl1iI;
                            }
/* 48 */                    if (i2 != 4) {
/* 66 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 38 */                        return null;
                            }
/* 54 */                    o00iOil2 = oOiIIO0.I00iOIl;
                            try {
/* 56 */                        lIoii1l01l0i.I00000oOI(objInvoke);
                            } catch (Throwable th6) {
/* 61 */                        th2 = th6;
/* 348 */                       O0Iioo1lO0o o0Iioo1lO0o42 = OOiIOloo0.I00000oIO;
/* 352 */                       OOiII0iO00O oOiII0iO00O52 = new OOiII0iO00O(4);
/* 355 */                       oOiII0iO00O52.I00iiI = o00iOil2;
/* 357 */                       VarHandle.storeStoreFence();
/* 360 */                       o0Iioo1lO0o42.I00000oIO(th2, oOiII0iO00O52);
/* 551 */                       return ooiIlOl1iI;
                            }
/* 551 */                   return ooiIlOl1iI;
                        }
/* 87 */                Function3 function33 = oOiIIO0.I00iiI;
/* 89 */                O00iOil o00iOil5 = oOiIIO0.I00iOIl;
/* 91 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 94 */                r8 = function33;
/* 95 */                o00iOil = o00iOil5;
/* 232 */               Oi0OO01oi oi0OO01oi2 = (Oi0OO01oi) objInvoke;
/* 234 */               O0Iioo1lO0o o0Iioo1lO0o32 = OOiIOloo0.I00000oIO;
/* 238 */               OOiII0iO00O oOiII0iO00O42 = new OOiII0iO00O(2);
/* 241 */               oOiII0iO00O42.I00iiI = o00iOil;
/* 243 */               VarHandle.storeStoreFence();
/* 246 */               o0Iioo1lO0o32.I00000oOI(oOiII0iO00O42);
/* 249 */               ii10ioolOI2 = this.I00000oOI;
/* 251 */               if (ii10ioolOI2 != null) {
/* 268 */                   O00illI0o000 o00illI0o000 = new O00illI0o000(o00iOil.I00000oIO, oi0OO01oi2 == null ? new Il01l1iIl() : oi0OO01oi2);
/* 271 */                   oOiIIO0.I00iOIl = o00iOil;
/* 273 */                   oOiIIO0.I00iiI = r8;
/* 275 */                   oOiIIO0.I00iiO = oi0OO01oi2;
/* 277 */                   oOiIIO0.I00ilO0 = 3;
/* 283 */                   if (ii10ioolOI2.I0001Ioi1lo(o00illI0o000, null, oOiIIO0) == ii0111o) {
/* 347 */                       return ii0111o;
                            }
                        }
/* 551 */               return ooiIlOl1iI;
                    } catch (Throwable th7) {
/* 209 */               OOiIOloo0.I00000oIO.I00000oIO(th7, new O1olloI0OlO(17));
/* 212 */               return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0001Ioi1lo(O00illI0o000 o00illI0o000, O00Ol10IiOoi o00Ol10IiOoi) {
                    Oi0IO1ii011 oi0IO1ii011;
                    OO0oOlOi1 oO0oOlOi1;
                    OOiIOI10OOIi oOiIOI10OOIi;
                    Object obj;
/* 2 */             if (o00illI0o000 == null || (oi0IO1ii011 = o00illI0o000.I00000oIO) == null) {
/* 13 */                oi0IO1ii011 = o00Ol10IiOoi != 0 ? o00Ol10IiOoi.I00000oIO : null;
                    }
                    while (true) {
/* 14 */                Object obj2 = this.I0000oI00;
/* 17 */                oO0oOlOi1 = (OO0oOlOi1) obj2;
/* 38 */                oOiIOI10OOIi = this;
/* 43 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(oOiIOI10OOIi, I000l1, obj2, (oi0IO1ii011 == null || !oO0oOlOi1.containsKey(oi0IO1ii011)) ? oO0oOlOi1 : oO0oOlOi1.I0001Ioi1lo(oi0IO1ii011))) {
                            break;
                        } else {
/* 140 */                   this = oOiIOI10OOIi;
                        }
                    }
/* 49 */            IlliIl1l11O illiIl1l11O = (IlliIl1l11O) oO0oOlOi1.get(oi0IO1ii011);
/* 51 */            if (illiIl1l11O == null) {
/* 105 */               O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 109 */               if (o00Ol10IiOoi != 0) {
/* 111 */                   o00illI0o000 = o00Ol10IiOoi;
                        }
/* 112 */               i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 136 */               new IllegalStateException("Received a response for an unknown message ID: ".concat(o011OoiO1I00000oIO.I0000O(iOi1iol.I00000oIO(O00OoO.Companion.serializer()), o00illI0o000)));
/* 139 */               return;
                    }
/* 53 */            if (oi0IO1ii011 != null) {
/* 72 */                do {
/* 55 */                    obj = oOiIOI10OOIi.I0001Ioi1lo;
/* 72 */                } while (!I1Ioolli0l0o.I00000oIO.compareAndSwapObject(oOiIOI10OOIi, I000OiO, obj, ((OO0oOlOi1) obj).I0001Ioi1lo(oi0IO1ii011)));
                    }
/* 74 */            if (o00illI0o000 != null) {
/* 76 */                illiIl1l11O.invoke(o00illI0o000, null);
                    } else if (o00Ol10IiOoi == 0) {
/* 99 */                I000II.I001IO000("Check failed.");
                    } else {
/* 84 */                OOillOoli oOillOoli = o00Ol10IiOoi.I00000oOI;
/* 93 */                illiIl1l11O.invoke(null, new O1i0lO(oOillOoli.I00000oIO, oOillOoli.I00000oOI));
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:8))(0)|7|9|(2:78|(1:(1:(2:14|15)(3:16|67|68))(3:17|18|19))(3:23|24|25))(2:26|(20:28|(1:30)|31|(1:33)(1:34)|35|(2:36|(1:83)(1:69))|38|74|39|40|72|41|42|81|43|44|79|45|(1:48)|65)(2:70|71))|76|49|(1:65)(1:52)|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0151, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x01b7, code lost:
                
                    r1 = r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
                /* JADX WARN: Type inference failed for: r1v0, types: [OOiIOI10OOIi] */
                /* JADX WARN: Type inference failed for: r4v20 */
                /* JADX WARN: Type inference failed for: r4v21 */
                /* JADX WARN: Type inference failed for: r4v22 */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6, types: [Oi0IO1ii011] */
                /* JADX WARN: Type inference failed for: r5v15 */
                /* JADX WARN: Type inference failed for: r5v16 */
                /* JADX WARN: Type inference failed for: r5v17 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6, types: [O00iOil] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(Oi01i1OIl oi01i1OIl, IOoilo iOoilo) {
                    OOiIIOooi oOiIIOooi;
                    long j;
                    Ii10ioolOI ii10ioolOI;
                    IOi10loi iOi10loi;
                    IOi10loi iOi10loi2;
                    O00iOil o00iOil;
                    Oi0IO111o10 oi0IO111o10;
                    O1i0lO o1i0lO;
                    ?? r5;
                    ?? r4;
                    O01O0o1iI o01O0o1iII0000Il00O;
                    Oi0IO111o10 oi0IO111o102;
                    O00iOil o00iOil2;
                    Oi0IO111o10 oi0IO111o103;
                    OO11OilO oO11OilO;
/* 1 */             ?? r1 = this;
/* 3 */             Oi01i1OIl oi01i1OIl2 = oi01i1OIl;
/* 9 */             if (iOoilo instanceof OOiIIOooi) {
/* 12 */                oOiIIOooi = (OOiIIOooi) iOoilo;
/* 14 */                int i = oOiIIOooi.I00li1OI;
/* 16 */                r4 = -2147483648;
/* 18 */                r5 = i & Integer.MIN_VALUE;
/* 20 */                if (r5 != 0) {
/* 23 */                    oOiIIOooi.I00li1OI = i - Integer.MIN_VALUE;
                        } else {
/* 29 */                    oOiIIOooi = new OOiIIOooi(r1, iOoilo);
                        }
                    }
/* 25 */            OOiIIOooi oOiIIOooi2 = oOiIIOooi;
/* 33 */            Object obj = oOiIIOooi2.I00l0I0l0lO1;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i2 = oOiIIOooi2.I00li1OI;
/* 39 */            IlliIl1l11O illiIl1l11O = null;
/* 43 */            if (i2 == 0) {
/* 109 */               lIoii1l01l0i.I00000oOI(obj);
/* 112 */               O0Iioo1lO0o o0Iioo1lO0o = OOiIOloo0.I00000oIO;
/* 117 */               OIOo1iiI oIOo1iiI = new OIOo1iiI(7);
/* 120 */               oIOo1iiI.I00iiI = oi01i1OIl2;
/* 122 */               VarHandle.storeStoreFence();
/* 125 */               o0Iioo1lO0o.I00000oOI(oIOo1iiI);
/* 130 */               IOi10loi iOi10loi3 = new IOi10loi();
/* 133 */               Ii10ioolOI ii10ioolOI2 = r1.I00000oOI;
/* 135 */               if (ii10ioolOI2 == null) {
/* 454 */                   I000II.I001IO000("Not connected");
/* 39 */                    return null;
                        }
/* 139 */               if (r1.I00000oIO != null) {
/* 145 */                   r1.I00000oIO(oi01i1OIl2.getMethod());
                        }
/* 152 */               String value = oi01i1OIl2.getMethod().getValue();
/* 156 */               Oi0O0llI oi0O0llII00000oIO = oi01i1OIl2.I00000oIO();
/* 160 */               IOoil1iiIilo iOoil1iiIilo = null;
/* 161 */               if (oi0O0llII00000oIO != null) {
/* 163 */                   O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 167 */                   i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 177 */                   o01O0o1iII0000Il00O = o011OoiO1I00000oIO.I0000Il00O(Oi0O0llI.Companion.serializer(), oi0O0llII00000oIO);
                        } else {
/* 182 */                   o01O0o1iII0000Il00O = null;
                        }
/* 193 */               Oi0IO111o10 oi0IO111o10I00000oIO = Oi0IO111o10.I00000oIO(li1O0IIOo.I0000Il00O().I00000oIO());
/* 197 */               O00iOil o00iOil3 = new O00iOil();
/* 200 */               o00iOil3.I00000oIO = oi0IO111o10I00000oIO;
/* 202 */               o00iOil3.I00000oOI = value;
/* 204 */               o00iOil3.I0000Il00O = o01O0o1iII0000Il00O;
/* 208 */               o00iOil3.I0000O = "2.0";
                        OOiIOI10OOIi oOiIOI10OOIi = r1;
                        while (true) {
/* 210 */                   Object obj2 = oOiIOI10OOIi.I0000oI00;
/* 219 */                   O1IIii o1IIii = new O1IIii(15);
/* 222 */                   o1IIii.I00iiI = iOi10loi3;
/* 224 */                   VarHandle.storeStoreFence();
/* 233 */                   oi0IO111o102 = oi0IO111o10I00000oIO;
/* 241 */                   if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(oOiIOI10OOIi, I000l1, obj2, ((OO0oOlOi1) obj2).I0000oI00(oi0IO111o10I00000oIO, o1IIii))) {
                                break;
                            }
/* 446 */                   oOiIOI10OOIi = this;
/* 448 */                   oi0IO111o10I00000oIO = oi0IO111o102;
                        }
/* 245 */               IOi10loi iOi10loi4 = iOi10loi3;
/* 254 */               I000oI1ioi i000oI1ioi = new I000oI1ioi(this, oi0IO111o102, ii10ioolOI2, iOi10loi4, (IOoil1iiIilo) null, 15);
/* 259 */               long j2 = OOiIOloo0.I00000oOI;
                        try {
/* 265 */                   j = j2;
/* 267 */                   o00iOil2 = o00iOil3;
                            try {
/* 273 */                       oO11OilO = new OO11OilO(this, o00iOil2, oi0IO111o102, iOoil1iiIilo, 1);
/* 276 */                       oi0IO111o103 = oi0IO111o102;
                            } catch (Oo11Oo e) {
/* 351 */                       e = e;
/* 352 */                       oi0IO111o103 = oi0IO111o102;
                            }
                        } catch (Oo11Oo e2) {
/* 354 */                   e = e2;
/* 355 */                   j = j2;
/* 356 */                   o00iOil2 = o00iOil3;
/* 357 */                   oi0IO111o103 = oi0IO111o102;
                        }
                        try {
/* 277 */                   oOiIIOooi2.I00iOIl = oi01i1OIl2;
/* 279 */                   oOiIIOooi2.I00iiI = iOi10loi4;
/* 281 */                   oOiIIOooi2.I00iiO = ii10ioolOI2;
/* 283 */                   oOiIIOooi2.I00iio = o00iOil2;
/* 285 */                   oOiIIOooi2.I00ilI0I1 = oi0IO111o103;
/* 287 */                   oOiIIOooi2.I00ilO0 = i000oI1ioi;
/* 289 */                   oOiIIOooi2.I00ioIO = j;
/* 291 */                   oOiIIOooi2.I00li1OI = 1;
/* 293 */                   iOi10loi4 = iOi10loi4;
                            try {
/* 302 */                       if (lOlo0o.I00000oOI(il0l1o1l.I0000O(j), oO11OilO, oOiIIOooi2) != ii0111o) {
/* 306 */                           illiIl1l11O = i000oI1ioi;
/* 307 */                           ii10ioolOI = ii10ioolOI2;
/* 308 */                           iOi10loi = iOi10loi4;
/* 309 */                           r5 = o00iOil2;
                                    r4 = oi0IO111o103;
                                }
                            } catch (Oo11Oo e3) {
/* 341 */                       e = e3;
/* 342 */                       IOi10loi iOi10loi5 = iOi10loi4;
/* 343 */                       o00iOil = o00iOil2;
/* 344 */                       iOi10loi2 = iOi10loi5;
/* 345 */                       illiIl1l11O = i000oI1ioi;
/* 346 */                       ii10ioolOI = ii10ioolOI2;
                                oi0IO111o10 = oi0IO111o103;
/* 360 */                       O0Iioo1lO0o o0Iioo1lO0o2 = OOiIOloo0.I00000oIO;
/* 365 */                       I100OioI1OOo i100OioI1OOo = new I100OioI1OOo(1);
/* 368 */                       i100OioI1OOo.I00iiI = j;
/* 370 */                       i100OioI1OOo.I00iiO = oi01i1OIl2;
/* 372 */                       VarHandle.storeStoreFence();
/* 375 */                       o0Iioo1lO0o2.I000OOo1O(i100OioI1OOo);
/* 404 */                       O1Oii0O0loo.I0000oI00(new OIoi0IIoi("timeout", O01O1110.I00000oIO(new Long(Iio1OlIo0.I0000Il00O(j)))));
/* 411 */                       o1i0lO = new O1i0lO(-32001, "Request timed out");
/* 414 */                       oOiIIOooi2.I00iOIl = oi01i1OIl2;
/* 416 */                       oOiIIOooi2.I00iiI = iOi10loi2;
/* 418 */                       oOiIIOooi2.I00iiO = ii10ioolOI;
/* 420 */                       oOiIIOooi2.I00iio = o00iOil;
/* 422 */                       oOiIIOooi2.I00ilI0I1 = oi0IO111o10;
/* 424 */                       oOiIIOooi2.I00ilO0 = illiIl1l11O;
/* 426 */                       oOiIIOooi2.I00io1l = e;
/* 428 */                       oOiIIOooi2.I00ioIO = j;
/* 431 */                       oOiIIOooi2.I00li1OI = 3;
/* 437 */                       if (illiIl1l11O.invoke(o1i0lO, oOiIIOooi2) != ii0111o) {
                                }
                            }
                        } catch (Oo11Oo e4) {
/* 348 */                   e = e4;
/* 349 */                   iOi10loi4 = iOi10loi4;
/* 342 */                   IOi10loi iOi10loi52 = iOi10loi4;
/* 343 */                   o00iOil = o00iOil2;
/* 344 */                   iOi10loi2 = iOi10loi52;
/* 345 */                   illiIl1l11O = i000oI1ioi;
/* 346 */                   ii10ioolOI = ii10ioolOI2;
                            oi0IO111o10 = oi0IO111o103;
/* 360 */                   O0Iioo1lO0o o0Iioo1lO0o22 = OOiIOloo0.I00000oIO;
/* 365 */                   I100OioI1OOo i100OioI1OOo2 = new I100OioI1OOo(1);
/* 368 */                   i100OioI1OOo2.I00iiI = j;
/* 370 */                   i100OioI1OOo2.I00iiO = oi01i1OIl2;
/* 372 */                   VarHandle.storeStoreFence();
/* 375 */                   o0Iioo1lO0o22.I000OOo1O(i100OioI1OOo2);
/* 404 */                   O1Oii0O0loo.I0000oI00(new OIoi0IIoi("timeout", O01O1110.I00000oIO(new Long(Iio1OlIo0.I0000Il00O(j)))));
/* 411 */                   o1i0lO = new O1i0lO(-32001, "Request timed out");
/* 414 */                   oOiIIOooi2.I00iOIl = oi01i1OIl2;
/* 416 */                   oOiIIOooi2.I00iiI = iOi10loi2;
/* 418 */                   oOiIIOooi2.I00iiO = ii10ioolOI;
/* 420 */                   oOiIIOooi2.I00iio = o00iOil;
/* 422 */                   oOiIIOooi2.I00ilI0I1 = oi0IO111o10;
/* 424 */                   oOiIIOooi2.I00ilO0 = illiIl1l11O;
/* 426 */                   oOiIIOooi2.I00io1l = e;
/* 428 */                   oOiIIOooi2.I00ioIO = j;
/* 431 */                   oOiIIOooi2.I00li1OI = 3;
/* 437 */                   if (illiIl1l11O.invoke(o1i0lO, oOiIIOooi2) != ii0111o) {
                            }
                        }
                    }
                    try {
                    } catch (Oo11Oo e5) {
/* 84 */                e = e5;
/* 85 */                j = r1;
/* 86 */                iOi10loi2 = iOi10loi;
                        oi0IO111o10 = r4;
                        o00iOil = r5;
/* 360 */               O0Iioo1lO0o o0Iioo1lO0o222 = OOiIOloo0.I00000oIO;
/* 365 */               I100OioI1OOo i100OioI1OOo22 = new I100OioI1OOo(1);
/* 368 */               i100OioI1OOo22.I00iiI = j;
/* 370 */               i100OioI1OOo22.I00iiO = oi01i1OIl2;
/* 372 */               VarHandle.storeStoreFence();
/* 375 */               o0Iioo1lO0o222.I000OOo1O(i100OioI1OOo22);
/* 404 */               O1Oii0O0loo.I0000oI00(new OIoi0IIoi("timeout", O01O1110.I00000oIO(new Long(Iio1OlIo0.I0000Il00O(j)))));
/* 411 */               o1i0lO = new O1i0lO(-32001, "Request timed out");
/* 414 */               oOiIIOooi2.I00iOIl = oi01i1OIl2;
/* 416 */               oOiIIOooi2.I00iiI = iOi10loi2;
/* 418 */               oOiIIOooi2.I00iiO = ii10ioolOI;
/* 420 */               oOiIIOooi2.I00iio = o00iOil;
/* 422 */               oOiIIOooi2.I00ilI0I1 = oi0IO111o10;
/* 424 */               oOiIIOooi2.I00ilO0 = illiIl1l11O;
/* 426 */               oOiIIOooi2.I00io1l = e;
/* 428 */               oOiIIOooi2.I00ioIO = j;
/* 431 */               oOiIIOooi2.I00li1OI = 3;
/* 437 */               if (illiIl1l11O.invoke(o1i0lO, oOiIIOooi2) != ii0111o) {
                        }
                    }
/* 45 */            if (i2 != 1) {
/* 47 */                if (i2 != 2) {
/* 49 */                    if (i2 != 3) {
/* 53 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 57 */                    Oo11Oo oo11Oo = oOiIIOooi2.I00io1l;
/* 59 */                    iOi10loi2 = oOiIIOooi2.I00iiI;
/* 61 */                    lIoii1l01l0i.I00000oOI(obj);
/* 441 */                   iOi10loi2.I000II(oo11Oo);
/* 444 */                   throw oo11Oo;
                        }
/* 66 */                long j3 = oOiIIOooi2.I00ioIO;
/* 68 */                IlliIl1l11O illiIl1l11O2 = oOiIIOooi2.I00ilO0;
/* 70 */                Oi0IO1ii011 oi0IO1ii011 = oOiIIOooi2.I00ilI0I1;
/* 72 */                O00iOil o00iOil4 = oOiIIOooi2.I00iio;
/* 74 */                Ii10ioolOI ii10ioolOI3 = oOiIIOooi2.I00iiO;
/* 76 */                IOi10loi iOi10loi6 = oOiIIOooi2.I00iiI;
/* 78 */                Oi01i1OIl oi01i1OIl3 = oOiIIOooi2.I00iOIl;
/* 80 */                lIoii1l01l0i.I00000oOI(obj);
/* 83 */                return obj;
                    }
/* 89 */            long j4 = oOiIIOooi2.I00ioIO;
/* 91 */            illiIl1l11O = oOiIIOooi2.I00ilO0;
/* 93 */            Oi0IO1ii011 oi0IO1ii0112 = oOiIIOooi2.I00ilI0I1;
/* 95 */            O00iOil o00iOil5 = oOiIIOooi2.I00iio;
/* 97 */            ii10ioolOI = oOiIIOooi2.I00iiO;
/* 99 */            iOi10loi = oOiIIOooi2.I00iiI;
/* 101 */           oi01i1OIl2 = oOiIIOooi2.I00iOIl;
/* 103 */           lIoii1l01l0i.I00000oOI(obj);
/* 106 */           j = j4;
                    r4 = oi0IO1ii0112;
                    r5 = o00iOil5;
/* 310 */           oOiIIOooi2.I00iOIl = oi01i1OIl2;
/* 312 */           oOiIIOooi2.I00iiI = iOi10loi;
/* 314 */           oOiIIOooi2.I00iiO = ii10ioolOI;
/* 316 */           oOiIIOooi2.I00iio = r5;
/* 318 */           oOiIIOooi2.I00ilI0I1 = r4;
/* 320 */           oOiIIOooi2.I00ilO0 = illiIl1l11O;
/* 322 */           oOiIIOooi2.I00ioIO = j;
/* 325 */           oOiIIOooi2.I00li1OI = 2;
/* 327 */           Object objI0010o = iOi10loi.I0010o(oOiIIOooi2);
/* 331 */           Ii0111o ii0111o2 = Ii0111o.I00iOIl;
                    return objI0010o == ii0111o ? ii0111o : objI0010o;
                }

                public final void I000O01llI0(O1llOlOo o1llOlOo, Function3 function3) {
/* 1 */             I00000oOI(o1llOlOo);
                    while (true) {
/* 4 */                 Object obj = this.I0000Il00O;
/* 28 */                OOiIOI10OOIi oOiIOI10OOIi = this;
/* 33 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(oOiIOI10OOIi, I000iOII, obj, ((OO0oOlOi1) obj).I0000oI00(o1llOlOo.getValue(), new I0i11IIlO(function3, (IOoil1iiIilo) null, 5)))) {
/* 35 */                    return;
                        } else {
/* 36 */                    this = oOiIOI10OOIi;
                        }
                    }
                }
            }
