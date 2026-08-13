            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
            public final class ii0iioiOi implements Oo0ooO0ll0 {
                public static final lOOlOoll I00iiO = new lOOlOoll(19);
                public final Oi0Oooi I00iOIl;
                public final iOl0lOIi11 I00iiI;

                public ii0iioiOi(iOl0lOIi11 iol0loii11, boolean z) {
                    iO0Oiil0l0 io0oiil0l0;
/* 4 */             this.I00iiI = iol0loii11;
/* 11 */            Oi0Oooi oi0Oooi = new Oi0Oooi(29, false);
/* 14 */            if (z) {
/* 22 */                iOli00o11Olo ioli00o11olo = (iOli00o11Olo) iIl1i1i11.I0000O.get();
/* 24 */                io0oiil0l0 = ioli00o11olo.I00000oOI;
/* 26 */                if (io0oiil0l0 != null) {
/* 28 */                    int i = iO10oO.I00000oIO;
                        } else {
/* 31 */                    int i2 = iO0Oiil0l0.I00iiI;
/* 33 */                    iIloilO00io iiloilo00io = iIloilO00io.I0000Il00O;
/* 42 */                    long jI00000oIO = iiloilo00io.I00000oIO() & (-61441);
/* 48 */                    long jI00000oIO2 = iiloilo00io.I00000oIO() >>> 2;
/* 49 */                    UUID uuid = iiloilo00io.I00000oIO;
/* 84 */                    String strConcat = "tk-trace-id: ".concat(String.valueOf(Long.toString(new UUID(jI00000oIO ^ uuid.getMostSignificantBits(), jI00000oIO2 ^ uuid.getLeastSignificantBits()).getLeastSignificantBits() >>> 1, 36)));
/* 94 */                    iiOlI01i1iI iioli01i1ii = (iiOlI01i1iI) iIl1i1i11.I00000oOI.get();
/* 100 */                   if (!iioli01i1ii.isEmpty()) {
/* 107 */                       iioli01i1ii.forEach(new iIoiolOlooo(0));
                            }
/* 112 */                   iO0Oiil0l0 io0oiil0l02 = new iO0Oiil0l0();
/* 115 */                   io0oiil0l02.I00iOIl = strConcat;
/* 119 */                   if (ioli00o11olo.I0000O == null) {
/* 121 */                       Thread.currentThread();
                            }
/* 124 */                   VarHandle.storeStoreFence();
/* 127 */                   io0oiil0l0 = io0oiil0l02;
                        }
                    } else {
/* 129 */               io0oiil0l0 = null;
                    }
/* 130 */           oi0Oooi.I00iiI = io0oiil0l0;
/* 132 */           this.I00iOIl = oi0Oooi;
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                @Override
                public final Object I00Ol00() {
/* 7 */             iOli00o11Olo ioli00o11olo = (iOli00o11Olo) iIl1i1i11.I0000O.get();
/* 9 */             Oi0Oooi oi0Oooi = ioli00o11olo.I0000O;
/* 11 */            iO0Oiil0l0 io0oiil0l0 = ioli00o11olo.I00000oOI;
/* 13 */            iO0Oiil0l0 io0oiil0l02 = ioli00o11olo.I0000Il00O;
/* 15 */            Oi0Oooi oi0Oooi2 = this.I00iOIl;
/* 17 */            if (io0oiil0l02 == null) {
/* 27 */                ioli00o11olo.I0000Il00O = io0oiil0l0 != null ? io0oiil0l0 : (iO0Oiil0l0) oi0Oooi2.I00iiI;
                    }
/* 29 */            ioli00o11olo.I0000O = oi0Oooi2;
/* 36 */            iIl1i1i11.I00000oIO(ioli00o11olo, (iO0Oiil0l0) oi0Oooi2.I00iiI, 1);
/* 41 */            ii0000IoooII ii0000ioooii = new ii0000IoooII();
/* 44 */            ii0000ioooii.I00000oIO = io0oiil0l0;
/* 46 */            ii0000ioooii.I00000oOI = oi0Oooi;
/* 48 */            ii0000ioooii.I0000Il00O = io0oiil0l02;
/* 50 */            VarHandle.storeStoreFence();
/* 55 */            return ii0000ioooii;
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }

                @Override
                public final void I00lll10(Object obj) {
/* 1 */             ii0000IoooII ii0000ioooii = (ii0000IoooII) obj;
/* 9 */             iOli00o11Olo ioli00o11olo = (iOli00o11Olo) iIl1i1i11.I0000O.get();
/* 14 */            iIl1i1i11.I00000oIO(ioli00o11olo, ii0000ioooii.I00000oIO, 3);
/* 19 */            ioli00o11olo.I0000O = ii0000ioooii.I00000oOI;
/* 23 */            ioli00o11olo.I0000Il00O = ii0000ioooii.I0000Il00O;
                }

                @Override
                public final Ii00l0i1loO getKey() {
/* 1 */             return I00iiO;
                }
            }
