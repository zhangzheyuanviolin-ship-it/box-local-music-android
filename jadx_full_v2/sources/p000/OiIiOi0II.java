            package p000;
            
            public final class OiIiOi0II implements OOooI0ioo1o {
                public OiIoliiIoIi0 I00iOIl;
                public OiIiol10 I00iiI;
                public String I00iiO;
                public Object I00iio;
                public Object[] I00ilI0I1;
                public OiIiloli0I I00ilO0;
                public OIOo1iiI I00io1l;

                public final void I00000oIO() {
                    String strI00000oIO;
/* 1 */             OIOo1iiI oIOo1iiI = this.I00io1l;
/* 3 */             OiIiol10 oiIiol10 = this.I00iiI;
/* 5 */             OiIiloli0I oiIiloli0I = this.I00ilO0;
/* 7 */             if (oiIiloli0I != null) {
/* 103 */               OIiilo1Ool0o.I0010o(oiIiloli0I, "entry(", ") is not null");
/* 110 */               return;
                    }
/* 9 */             if (oiIiol10 != null) {
/* 11 */                Object objInvoke = oIOo1iiI.invoke();
/* 15 */                if (objInvoke == null || oiIiol10.I0000Il00O(objInvoke)) {
/* 96 */                    this.I00ilO0 = oiIiol10.I00000oIO(this.I00iiO, oIOo1iiI);
/* 98 */                    return;
                        }
/* 27 */                if (objInvoke instanceof Ol1ll0O) {
/* 29 */                    Ol1ll0O ol1ll0O = (Ol1ll0O) objInvoke;
/* 37 */                    if (ol1ll0O.I0000oI00() == IIIOlol.I00ilO0 || ol1ll0O.I0000oI00() == Io1Oioii1111.I00ilO0 || ol1ll0O.I0000oI00() == IOO0o0I1l.I00ilI0I1) {
/* 77 */                        strI00000oIO = "MutableState containing " + ol1ll0O.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                            } else {
/* 55 */                        strI00000oIO = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                            }
                        } else {
/* 82 */                    strI00000oIO = lIo1lO.I00000oIO(objInvoke);
                        }
/* 89 */                throw new IllegalArgumentException(strI00000oIO);
                    }
                }

                @Override
                public final void I00000oOI() {
/* 1 */             OiIiloli0I oiIiloli0I = this.I00ilO0;
/* 3 */             if (oiIiloli0I != null) {
/* 7 */                 ((IOO000ilo) oiIiloli0I).I00Io1o110i();
                    }
                }

                @Override
                public final void I0000O() {
/* 1 */             OiIiloli0I oiIiloli0I = this.I00ilO0;
/* 3 */             if (oiIiloli0I != null) {
/* 7 */                 ((IOO000ilo) oiIiloli0I).I00Io1o110i();
                    }
                }

                @Override
                public final void I0000oI00() {
/* 1 */             I00000oIO();
                }
            }
