            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class il01ioIoI {
                public static final Ii00l101O I00000oIO(Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, IOoilo iOoilo) {
/* 11 */            OoI0O1 ooI0O1 = (OoI0O1) iOoilo.getContext().I00lli11(OoI0O1.I00iiI);
/* 19 */            Ii00l101O ii00l101O = ooI0O1 != null ? ooI0O1.I00iOIl : null;
/* 24 */            if (!oi1oIiOiIi0.I000iOII()) {
/* 55 */                Ii00l101O ii00l101OI000O01llI0 = oi1oIiOiIi0.I000O01llI0();
/* 59 */                if (ii00l101O == null) {
/* 62 */                    ii00l101O = Il00o11.I00iOIl;
                        }
/* 64 */                return ii00l101OI000O01llI0.I00ioIO(ii00l101O);
                    }
/* 26 */            if (ii00l101O != null) {
/* 32 */                return oi1oIiOiIi0.I000O01llI0().I00ioIO(ii00l101O);
                    }
/* 37 */            if (!z) {
/* 50 */                return oi1oIiOiIi0.I000O01llI0();
                    }
/* 39 */            Ii00l101O ii00l101O2 = oi1oIiOiIi0.I00000oOI;
/* 41 */            if (ii00l101O2 != null) {
/* 43 */                return ii00l101O2;
                    }
/* 46 */            O0000Ioio00.I000OOo1O("transactionContext");
/* 49 */            throw null;
                }

                public static final Object I00000oOI(Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, boolean z2, Function1 function1) {
/* 1 */             ThreadLocal threadLocal = oi1oIiOiIi0.I000OOo1O;
/* 3 */             oi1oIiOiIi0.I00000oIO();
/* 10 */            if (oi1oIiOiIi0.I000iOII() && !oi1oIiOiIi0.I000l1()) {
/* 22 */                Ii00l101O ii00l101O = (Ii00l101O) threadLocal.get();
/* 37 */                if ((ii00l101O != null ? (OoI0O1) ii00l101O.I00lli11(OoI0O1.I00iiI) : null) != null) {
/* 42 */                    I000II.I001IO000("Cannot access database on a different coroutine context inherited from a suspending transaction.");
/* 24 */                    return null;
                        }
                    }
/* 50 */            Ii00l101O ii00l101O2 = (Ii00l101O) threadLocal.get();
/* 52 */            if (ii00l101O2 == null) {
/* 54 */                ii00l101O2 = Il00o11.I00iOIl;
                    }
/* 67 */            return lO00OiilOI0l.I00000oIO(new Ii0lollI(ii00l101O2, oi1oIiOiIi0, z2, z, function1, null));
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(IOoil1iiIilo iOoil1iiIilo, Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, boolean z2, Function1 function1) throws Throwable {
                    Ii0loo ii0loo;
                    Oi1oIiOiIi0 oi1oIiOiIi02;
                    boolean z3;
                    boolean z4;
                    Function1 function12;
/* 3 */             if (iOoil1iiIilo instanceof Ii0loo) {
/* 6 */                 ii0loo = (Ii0loo) iOoil1iiIilo;
/* 8 */                 int i = ii0loo.I00ilO0;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii0loo.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    ii0loo = new Ii0loo(iOoil1iiIilo);
                        }
                    }
/* 19 */            Ii0loo ii0loo2 = ii0loo;
/* 27 */            Object obj = ii0loo2.I00ilI0I1;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ii0loo2.I00ilO0;
/* 37 */            if (i2 == 0) {
/* 75 */                lIoii1l01l0i.I00000oOI(obj);
/* 82 */                if (oi1oIiOiIi0.I000iOII() && oi1oIiOiIi0.I000oI1ioi() && oi1oIiOiIi0.I000l1()) {
/* 107 */                   Ii0lo0iOoOO1 ii0lo0iOoOO1 = new Ii0lo0iOoOO1(z2, z, oi1oIiOiIi0, null, function1, 1);
/* 112 */                   ii0loo2.I00ilO0 = 1;
/* 114 */                   Object objI00111O = oi1oIiOiIi0.I00111O(z, ii0lo0iOoOO1, ii0loo2);
/* 118 */                   if (objI00111O != ii0111o) {
/* 121 */                       return objI00111O;
                            }
                        } else {
/* 126 */                   ii0loo2.I00iOIl = oi1oIiOiIi0;
/* 130 */                   ii0loo2.I00iiI = function1;
/* 132 */                   ii0loo2.I00iiO = z;
/* 134 */                   ii0loo2.I00iio = z2;
/* 136 */                   ii0loo2.I00ilO0 = 2;
/* 138 */                   Ii00l101O ii00l101OI00000oIO = I00000oIO(oi1oIiOiIi0, z2, ii0loo2);
/* 142 */                   if (ii00l101OI00000oIO != ii0111o) {
/* 145 */                       oi1oIiOiIi02 = oi1oIiOiIi0;
/* 146 */                       z3 = z;
/* 147 */                       obj = ii00l101OI00000oIO;
/* 148 */                       z4 = z2;
/* 149 */                       function12 = function1;
                            }
                        }
                    }
/* 39 */            if (i2 == 1) {
/* 71 */                lIoii1l01l0i.I00000oOI(obj);
/* 74 */                return obj;
                    }
/* 41 */            if (i2 != 2) {
/* 43 */                if (i2 == 3) {
/* 45 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    return obj;
                        }
/* 51 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 55 */            boolean z5 = ii0loo2.I00iio;
/* 57 */            boolean z6 = ii0loo2.I00iiO;
/* 59 */            Function1 function13 = ii0loo2.I00iiI;
/* 61 */            Oi1oIiOiIi0 oi1oIiOiIi03 = ii0loo2.I00iOIl;
/* 63 */            lIoii1l01l0i.I00000oOI(obj);
/* 66 */            z4 = z5;
/* 67 */            z3 = z6;
/* 68 */            function12 = function13;
/* 69 */            oi1oIiOiIi02 = oi1oIiOiIi03;
/* 155 */           Ii0loi11oIl ii0loi11oIl = new Ii0loi11oIl((IOoil1iiIilo) null, oi1oIiOiIi02, z3, z4, function12);
/* 158 */           ii0loo2.I00iOIl = null;
/* 160 */           ii0loo2.I00iiI = null;
/* 162 */           ii0loo2.I00ilO0 = 3;
/* 164 */           Object objI0000oI00 = iOi1II01i0.I0000oI00((Ii00l101O) obj, ii0loi11oIl, ii0loo2);
                    return objI0000oI00 == ii0111o ? ii0111o : objI0000oI00;
                }
            }
