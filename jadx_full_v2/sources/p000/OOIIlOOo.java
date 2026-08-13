            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Objects;
            
            public final class OOIIlOOo implements OIOiOllolii {
                public IIllOioOlolI I00000oIO;
                public OI0lOii0I I00000oOI;
                public OOIIollIo I0000Il00O;
                public OOIO1OOiI0 I0000O;
                public Illo1O1o I0000oI00;
                public boolean I0001Ioi1lo;

                @Override
                public final void I00000oIO(Object obj) {
/* 1 */             IIllOlooI iIllOlooI = (IIllOlooI) obj;
/* 3 */             IIllOlooI iIllOlooI2 = IIllOlooI.I00ilI0I1;
/* 5 */             OOIIollIo oOIIollIo = OOIIollIo.I00iOIl;
/* 7 */             if (iIllOlooI == iIllOlooI2 || iIllOlooI == IIllOlooI.I00iiO || iIllOlooI == IIllOlooI.I00iiI || iIllOlooI == IIllOlooI.I00iOIl) {
/* 135 */               I00000oOI(oOIIollIo);
/* 140 */               if (this.I0001Ioi1lo) {
/* 143 */                   this.I0001Ioi1lo = false;
/* 145 */                   Illo1O1o illo1O1o = this.I0000oI00;
/* 147 */                   if (illo1O1o != null) {
/* 149 */                       illo1O1o.cancel(false);
/* 153 */                       this.I0000oI00 = null;
/* 168 */                       return;
                            }
/* 168 */                   return;
                        }
/* 168 */               return;
                    }
/* 24 */            if ((iIllOlooI == IIllOlooI.I00ilO0 || iIllOlooI == IIllOlooI.I00io1l || iIllOlooI == IIllOlooI.I00iio) && !this.I0001Ioi1lo) {
/* 38 */                IIllOioOlolI iIllOioOlolI = this.I00000oIO;
/* 40 */                I00000oOI(oOIIollIo);
/* 45 */                ArrayList arrayList = new ArrayList();
/* 52 */                IIoIil iIoIil = new IIoIil(13);
/* 55 */                iIoIil.I00iiI = iIllOioOlolI;
/* 57 */                iIoIil.I00iiO = arrayList;
/* 59 */                VarHandle.storeStoreFence();
/* 66 */                Illo1O1o illo1O1oI00000oIO = Illo1O1o.I00000oIO(iOiiloIII0O.I00000oIO(iIoIil));
/* 72 */                OOIIioOI1i0o oOIIioOI1i0o = new OOIIioOI1i0o();
/* 75 */                oOIIioOI1i0o.I00iOIl = this;
/* 77 */                VarHandle.storeStoreFence();
/* 84 */                IO0oo1I0oIO iO0oo1I0oIOI000O01llI0 = iIllIoiiIO.I000O01llI0(illo1O1oI00000oIO, oOIIioOI1i0o, Iii11l.I00000oIO());
/* 90 */                OOIIioOI1i0o oOIIioOI1i0o2 = new OOIIioOI1i0o();
/* 93 */                oOIIioOI1i0o2.I00iOIl = this;
/* 95 */                VarHandle.storeStoreFence();
/* 102 */               IO0oo1I0oIO iO0oo1I0oIOI000II = iIllIoiiIO.I000II(iO0oo1I0oIOI000O01llI0, oOIIioOI1i0o2, Iii11l.I00000oIO());
/* 106 */               this.I0000oI00 = iO0oo1I0oIOI000II;
/* 112 */               IOO000ilo iOO000ilo = new IOO000ilo(24);
/* 115 */               iOO000ilo.I00iio = this;
/* 117 */               iOO000ilo.I00iiI = arrayList;
/* 119 */               iOO000ilo.I00iiO = iIllOioOlolI;
/* 121 */               VarHandle.storeStoreFence();
/* 128 */               iIllIoiiIO.I00000oIO(iO0oo1I0oIOI000II, iOO000ilo, Iii11l.I00000oIO());
/* 132 */               this.I0001Ioi1lo = true;
                    }
                }

                public final void I00000oOI(OOIIollIo oOIIollIo) {
                    synchronized (this) {
                        try {
/* 8 */                     if (this.I0000Il00O.equals(oOIIollIo)) {
/* 11 */                        return;
                            }
/* 14 */                    this.I0000Il00O = oOIIollIo;
/* 19 */                    Objects.toString(oOIIollIo);
/* 23 */                    l11I11lO.I0000O(3, "StreamStateObserver");
/* 28 */                    this.I00000oOI.I000OOo1O(oOIIollIo);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                @Override
                public final void onError(Throwable th) {
/* 1 */             Illo1O1o illo1O1o = this.I0000oI00;
/* 3 */             if (illo1O1o != null) {
/* 6 */                 illo1O1o.cancel(false);
/* 10 */                this.I0000oI00 = null;
                    }
/* 14 */            I00000oOI(OOIIollIo.I00iOIl);
                }
            }
