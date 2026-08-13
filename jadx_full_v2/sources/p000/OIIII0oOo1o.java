            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIIII0oOo1o {
                public OIIIi0lOoOl I00000oIO;
                public OIIIi0lOoOl I00000oOI;
                public IllOOo00lI I0000Il00O;
                public Ii0110 I0000O;

                public OIIII0oOo1o() {
/* 8 */             IlIi0Il ilIi0Il = new IlIi0Il(25);
/* 11 */            ilIi0Il.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            this.I0000Il00O = ilIi0Il;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
                
                    if (r0 == r1) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
                
                    if (r0 == r1) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(long j, long j2, IOoilo iOoilo) throws Throwable {
                    OII1li oII1li;
                    long j3;
/* 3 */             if (iOoilo instanceof OII1li) {
/* 6 */                 oII1li = (OII1li) iOoilo;
/* 8 */                 int i = oII1li.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oII1li.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    oII1li = new OII1li(this, iOoilo);
                        }
                    }
/* 19 */            OII1li oII1li2 = oII1li;
/* 27 */            Object objI001lllioOl = oII1li2.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oII1li2.I00iiO;
/* 36 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(objI001lllioOl);
/* 59 */                OIIIi0lOoOl oIIIi0lOoOl = this.I00000oIO;
/* 69 */                j3 = 0;
/* 71 */                if ((oIIIi0lOoOl != null ? oIIIi0lOoOl.I010l1ol111() : null) == null) {
/* 73 */                    OIIIi0lOoOl oIIIi0lOoOl2 = this.I00000oOI;
/* 75 */                    if (oIIIi0lOoOl2 != null) {
/* 77 */                        oII1li2.I00iiO = 1;
/* 79 */                        objI001lllioOl = oIIIi0lOoOl2.I001lllioOl(j, j2, oII1li2);
                            }
                        } else {
/* 91 */                    OIIIi0lOoOl oIIIi0lOoOl3 = this.I00000oIO;
/* 95 */                    OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = oIIIi0lOoOl3 != null ? oIIIi0lOoOl3.I010l1ol111() : null;
/* 100 */                   if (oIIIi0lOoOlI010l1ol111 != null) {
/* 102 */                       oII1li2.I00iiO = 2;
/* 104 */                       objI001lllioOl = oIIIi0lOoOlI010l1ol111.I001lllioOl(j, j2, oII1li2);
                            }
                        }
                    } else if (i2 == 1) {
/* 52 */                lIoii1l01l0i.I00000oOI(objI001lllioOl);
/* 88 */                j3 = ((OooIOilolOo) objI001lllioOl).I00000oIO;
                    } else {
/* 40 */                if (i2 != 2) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 42 */                lIoii1l01l0i.I00000oOI(objI001lllioOl);
/* 113 */               j3 = ((OooIOilolOo) objI001lllioOl).I00000oIO;
                    }
/* 115 */           return OooIOilolOo.I00000oIO(j3);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(long j, IOoilo iOoilo) throws Throwable {
                    OII1oil oII1oil;
                    long j2;
/* 3 */             if (iOoilo instanceof OII1oil) {
/* 6 */                 oII1oil = (OII1oil) iOoilo;
/* 8 */                 int i = oII1oil.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oII1oil.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oII1oil = new OII1oil(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00ll1 = oII1oil.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oII1oil.I00iiO;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00ll1);
/* 50 */                OIIIi0lOoOl oIIIi0lOoOl = this.I00000oIO;
/* 54 */                OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = oIIIi0lOoOl != null ? oIIIi0lOoOl.I010l1ol111() : null;
/* 58 */                if (oIIIi0lOoOlI010l1ol111 == null) {
/* 74 */                    j2 = 0;
/* 76 */                    return OooIOilolOo.I00000oIO(j2);
                        }
/* 60 */                oII1oil.I00iiO = 1;
/* 62 */                objI00ll1 = oIIIi0lOoOlI010l1ol111.I00ll1(j, oII1oil);
/* 66 */                if (objI00ll1 == ii0111o) {
/* 68 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI00ll1);
                    }
/* 71 */            j2 = ((OooIOilolOo) objI00ll1).I00000oIO;
/* 76 */            return OooIOilolOo.I00000oIO(j2);
                }

                public final Ii0110 I0000Il00O() {
/* 7 */             Ii0110 ii0110 = (Ii0110) this.I0000Il00O.invoke();
/* 9 */             if (ii0110 != null) {
/* 11 */                return ii0110;
                    }
/* 14 */            I000II.I001IO000("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
/* 17 */            return null;
                }
            }
