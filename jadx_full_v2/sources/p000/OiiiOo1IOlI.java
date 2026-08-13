            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiiiOo1IOlI {
                public final long I00000oIO;
                public final Oiio1oll000 I00000oOI;
                public final long I0000Il00O;
                public IOO000ilo I0000O = IOO000ilo.I00io1l;
                public OI0i1o0iOo0 I0000oI00;
                public final III0Ii I0001Ioi1lo;
                public final O1ooiI111i I000II;

                public OiiiOo1IOlI(long j, Oiio1oll000 oiio1oll000, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = oiio1oll000;
/* 8 */             this.I0000Il00O = j2;
/* 14 */            III0Ii iII0IiI00000oIO = i1IlOlo1.I00000oIO();
/* 18 */            this.I0001Ioi1lo = iII0IiI00000oIO;
/* 23 */            Oiii0oI1o oiii0oI1o = new Oiii0oI1o(3);
/* 26 */            oiii0oI1o.I00iiI = this;
/* 28 */            VarHandle.storeStoreFence();
/* 33 */            Oiio0lIlOOi1 oiio0lIlOOi1 = new Oiio0lIlOOi1();
/* 36 */            oiio0lIlOOi1.I00000oIO = oiio1oll000;
/* 38 */            oiio0lIlOOi1.I00000oOI = j;
/* 40 */            oiio0lIlOOi1.I0000Il00O = oiii0oI1o;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            O1ooiI111i o1ooiI111iI00000oOI = i1IlOlo1.I00000oOI(oiio0lIlOOi1, iII0IiI00000oIO);
/* 51 */            OO1iIiOoO0.I00000oIO.getClass();
/* 60 */            this.I000II = lI1iiO11I.I00000oIO(o1ooiI111iI00000oOI, iO0OI01loOo.I00000oOI);
                }

                public final void I00000oIO() {
/* 6 */             Oiii0oI1o oiii0oI1o = new Oiii0oI1o(0);
/* 9 */             oiii0oI1o.I00iiI = this;
/* 11 */            VarHandle.storeStoreFence();
/* 17 */            Oiii0oI1o oiii0oI1o2 = new Oiii0oI1o(1);
/* 20 */            oiii0oI1o2.I00iiI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 28 */            Oiii0oI1o oiii0oI1o3 = new Oiii0oI1o(2);
/* 31 */            oiii0oI1o3.I00iiI = this;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            OI0i1o0iOo0 oI0i1o0iOo0 = new OI0i1o0iOo0();
/* 39 */            long j = this.I00000oIO;
/* 41 */            oI0i1o0iOo0.I00000oIO = j;
/* 43 */            oI0i1o0iOo0.I00000oOI = oiii0oI1o;
/* 45 */            oI0i1o0iOo0.I0000Il00O = oiii0oI1o2;
/* 47 */            oI0i1o0iOo0.I0000O = oiii0oI1o3;
/* 51 */            oI0i1o0iOo0.I0000oI00 = this.I0001Ioi1lo;
/* 53 */            oI0i1o0iOo0.I0001Ioi1lo = oI0i1o0iOo0;
/* 56 */            oI0i1o0iOo0.I000O01llI0 = -1;
/* 58 */            VarHandle.storeStoreFence();
/* 61 */            Oiio1oll000 oiio1oll000 = this.I00000oOI;
/* 63 */            OI0lli1 oI0lli1 = oiio1oll000.I0000Il00O;
/* 69 */            if (j == 0) {
/* 86 */                Ioll0IliO1l.I00000oIO("The selectable contains an invalid id: " + j);
                    }
/* 93 */            if (oI0lli1.I00000oOI(j)) {
/* 114 */               Ioll0IliO1l.I00000oIO("Another selectable with the id: " + j + " has already subscribed.");
                    }
/* 117 */           oI0lli1.I000OOo1O(j, oI0i1o0iOo0);
/* 122 */           oiio1oll000.I00000oOI.add(oI0i1o0iOo0);
/* 125 */           oiio1oll000.I00000oIO = false;
/* 127 */           this.I0000oI00 = oI0i1o0iOo0;
                }

                public final void I00000oOI() {
/* 1 */             OI0i1o0iOo0 oI0i1o0iOo0 = this.I0000oI00;
/* 3 */             if (oI0i1o0iOo0 != null) {
/* 5 */                 Oiio1oll000 oiio1oll000 = this.I00000oOI;
/* 7 */                 OI0lli1 oI0lli1 = oiio1oll000.I0000Il00O;
/* 9 */                 long j = oI0i1o0iOo0.I00000oIO;
/* 15 */                if (oI0lli1.I00000oOI(j)) {
/* 20 */                    oiio1oll000.I00000oOI.remove(oI0i1o0iOo0);
/* 23 */                    oI0lli1.I000II(j);
/* 26 */                    Oiii0i1Oil1 oiii0i1Oil1 = oiio1oll000.I000OiO;
/* 28 */                    if (oiii0i1Oil1 != null) {
/* 34 */                        oiii0i1Oil1.invoke(Long.valueOf(j));
                            }
                        }
/* 38 */                this.I0000oI00 = null;
                    }
                }

                public final void I0000Il00O(Oo0iil0o0oI oo0iil0o0oI) {
                    Oiii0i1Oil1 oiii0i1Oil1;
/* 5 */             Oo0iil0o0oI oo0iil0o0oI2 = (Oo0iil0o0oI) this.I0000O.I00iiO;
/* 7 */             if (oo0iil0o0oI2 != null && !O0000Ioio00.I0000O(oo0iil0o0oI2.I00000oIO.I00000oIO, oo0iil0o0oI.I00000oIO.I00000oIO) && (oiii0i1Oil1 = this.I00000oOI.I000OOo1O) != null) {
/* 35 */                oiii0i1Oil1.invoke(Long.valueOf(this.I00000oIO));
                    }
/* 46 */            this.I0000O = IOO000ilo.I000lI(this.I0000O, null, oo0iil0o0oI, null, 5);
                }
            }
