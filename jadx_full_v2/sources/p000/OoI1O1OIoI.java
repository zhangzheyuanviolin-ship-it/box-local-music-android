            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoI1O1OIoI implements OlO01l1oOil {
                public final OoIoOiiO1 I00iOIl;
                public final OIooliIO0 I00iiI;
                public final OIooliIO0 I00iiO;
                public final OIooliIO0 I00iio;
                public Oii0iO0iOI I00ilI0I1;
                public OloIIOlO I00ilO0;
                public final OIooliIO0 I00io1l;
                public final OIooO1iiliI I00ioIO;
                public boolean I00l0I0l0lO1;
                public final OIooliIO0 I00l0OO0IO;
                public I110ooool I00li1OI;
                public final OIool0l11 I00ll1;
                public boolean I00lli11;
                public final OlIOiI1iI1 I00lll10;
                public final OoI1Oi0l1I0o I00o0iI0io1;

                public OoI1O1OIoI(OoI1Oi0l1I0o ooI1Oi0l1I0o, Object obj, I110ooool i110ooool, OoIoOiiO1 ooIoOiiO1) {
/* 4 */             this.I00o0iI0io1 = ooI1Oi0l1I0o;
/* 6 */             this.I00iOIl = ooIoOiiO1;
/* 8 */             OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(obj);
/* 12 */            this.I00iiI = oIooliIO0I00000oIO;
/* 16 */            Object objInvoke = null;
/* 21 */            OIooliIO0 oIooliIO0I00000oIO2 = lOO00IiI0li.I00000oIO(iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7));
/* 25 */            this.I00iiO = oIooliIO0I00000oIO2;
/* 50 */            this.I00iio = lOO00IiI0li.I00000oIO(new OloIIOlO((IlIoO1ilo1) oIooliIO0I00000oIO2.getValue(), ooIoOiiO1, obj, oIooliIO0I00000oIO.getValue(), i110ooool));
/* 58 */            this.I00io1l = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 67 */            this.I00ioIO = new OIooO1iiliI(-1.0f);
/* 73 */            this.I00l0OO0IO = lOO00IiI0li.I00000oIO(obj);
/* 75 */            this.I00li1OI = i110ooool;
/* 90 */            this.I00ll1 = new OIool0l11(I00000oIO().I00000oOI());
/* 98 */            Float f = (Float) Ooooi01I.I00000oOI.get(ooIoOiiO1);
/* 100 */           if (f != null) {
/* 102 */               float fFloatValue = f.floatValue();
/* 112 */               I110ooool i110ooool2 = (I110ooool) ooIoOiiO1.I00000oIO.invoke(obj);
/* 114 */               int iI00000oOI = i110ooool2.I00000oOI();
/* 119 */               for (int i = 0; i < iI00000oOI; i++) {
/* 121 */                   i110ooool2.I0000oI00(i, fFloatValue);
                        }
/* 131 */               objInvoke = this.I00iOIl.I00000oOI.invoke(i110ooool2);
                    }
/* 140 */           this.I00lll10 = iOO01lio0.I0000Il00O(0.0f, 0.0f, objInvoke, 3);
                }

                public final OloIIOlO I00000oIO() {
/* 7 */             return (OloIIOlO) this.I00iio.getValue();
                }

                public final void I00000oOI(long j) {
/* 11 */            if (this.I00ioIO.I000II() == -1.0f) {
/* 14 */                this.I00lli11 = true;
/* 32 */                if (O0000Ioio00.I0000O(I00000oIO().I0000Il00O, I00000oIO().I0000O)) {
/* 40 */                    I0000O(I00000oIO().I0000Il00O);
                        } else {
/* 52 */                    I0000O(I00000oIO().I000II(j));
/* 63 */                    this.I00li1OI = I00000oIO().I0000O(j);
                        }
                    }
                }

                public final void I0000O(Object obj) {
/* 3 */             this.I00l0OO0IO.setValue(obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0001Ioi1lo(Object obj, boolean z) {
                    IlIoO1ilo1 ilIoO1ilo1;
/* 3 */             OloIIOlO oloIIOlO = this.I00ilO0;
/* 10 */            Object obj2 = oloIIOlO != null ? oloIIOlO.I0000Il00O : null;
/* 11 */            OIooliIO0 oIooliIO0 = this.I00iiI;
/* 17 */            boolean zI0000O = O0000Ioio00.I0000O(obj2, oIooliIO0.getValue());
/* 21 */            OIool0l11 oIool0l11 = this.I00ll1;
/* 23 */            OIooliIO0 oIooliIO02 = this.I00iio;
/* 26 */            IlIoO1ilo1 ilIoO1ilo12 = this.I00lll10;
/* 28 */            if (zI0000O) {
/* 47 */                oIooliIO02.setValue(new OloIIOlO(ilIoO1ilo12, this.I00iOIl, obj, obj, this.I00li1OI.I0000Il00O()));
/* 50 */                this.I00l0I0l0lO1 = true;
/* 60 */                oIool0l11.I000O01llI0(I00000oIO().I00000oOI());
/* 63 */                return;
                    }
/* 64 */            OIooliIO0 oIooliIO03 = this.I00iiO;
/* 66 */            if (!z || this.I00lli11 || (((IlIoO1ilo1) oIooliIO03.getValue()) instanceof OlIOiI1iI1)) {
/* 87 */                ilIoO1ilo12 = (IlIoO1ilo1) oIooliIO03.getValue();
                    }
/* 97 */            OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00o0iI0io1;
/* 107 */           if (ooI1Oi0l1I0o.I0000oI00() <= 0) {
/* 109 */               ilIoO1ilo1 = ilIoO1ilo12;
                    } else {
/* 111 */               long jI0000oI00 = ooI1Oi0l1I0o.I0000oI00();
/* 117 */               OlIoo1 olIoo1 = new OlIoo1();
/* 120 */               olIoo1.I00000oIO = ilIoO1ilo12;
/* 122 */               olIoo1.I00000oOI = jI0000oI00;
/* 124 */               VarHandle.storeStoreFence();
/* 127 */               ilIoO1ilo1 = olIoo1;
                    }
/* 143 */           oIooliIO02.setValue(new OloIIOlO(ilIoO1ilo1, this.I00iOIl, obj, oIooliIO0.getValue(), this.I00li1OI));
/* 154 */           oIool0l11.I000O01llI0(I00000oIO().I00000oOI());
/* 158 */           this.I00l0I0l0lO1 = false;
/* 160 */           ooI1Oi0l1I0o.I00100o1O0lo(true);
/* 167 */           if (ooI1Oi0l1I0o.I000OOo1O()) {
/* 169 */               Ol1o0O0O0 ol1o0O0O0 = ooI1Oi0l1I0o.I000OiO;
/* 171 */               int size = ol1o0O0O0.size();
/* 176 */               long jMax = 0;
/* 177 */               for (int i = 0; i < size; i++) {
/* 183 */                   OoI1O1OIoI ooI1O1OIoI = (OoI1O1OIoI) ol1o0O0O0.get(i);
/* 191 */                   jMax = Math.max(jMax, ooI1O1OIoI.I00ll1.I000II());
/* 195 */                   ooI1O1OIoI.I00000oOI(0L);
                        }
/* 201 */               ooI1Oi0l1I0o.I00100o1O0lo(false);
                    }
                }

                public final void I000II(Object obj, Object obj2, IlIoO1ilo1 ilIoO1ilo1) {
/* 3 */             this.I00iiI.setValue(obj2);
/* 8 */             this.I00iiO.setValue(ilIoO1ilo1);
/* 21 */            if (O0000Ioio00.I0000O(I00000oIO().I0000O, obj) && O0000Ioio00.I0000O(I00000oIO().I0000Il00O, obj2)) {
/* 35 */                return;
                    }
/* 37 */            I0001Ioi1lo(obj, false);
                }

                public final void I000O01llI0(Object obj, IlIoO1ilo1 ilIoO1ilo1, Object obj2, I110ooool i110ooool) {
/* 3 */             if (this.I00l0I0l0lO1) {
/* 5 */                 OloIIOlO oloIIOlO = this.I00ilO0;
/* 17 */                if (O0000Ioio00.I0000O(obj, oloIIOlO != null ? oloIIOlO.I0000Il00O : null)) {
/* 58 */                    return;
                        }
                    }
/* 20 */            OIooliIO0 oIooliIO0 = this.I00iiI;
/* 26 */            boolean zI0000O = O0000Ioio00.I0000O(oIooliIO0.getValue(), obj);
/* 32 */            OIooO1iiliI oIooO1iiliI = this.I00ioIO;
/* 34 */            if (zI0000O && oIooO1iiliI.I000II() == -1.0f && (obj2 == null || obj2.equals(I00000oIO().I0000O))) {
/* 58 */                return;
                    }
/* 59 */            oIooliIO0.setValue(obj);
/* 64 */            this.I00iiO.setValue(ilIoO1ilo1);
/* 88 */            Object value = obj2 == null ? oIooO1iiliI.I000II() == -3.0f ? obj : this.I00l0OO0IO.getValue() : obj2;
/* 89 */            if (obj2 != null) {
/* 91 */                I0000O(value);
/* 94 */                if (i110ooool != null) {
/* 96 */                    this.I00li1OI = i110ooool;
                        }
                    }
/* 98 */            OIooliIO0 oIooliIO02 = this.I00io1l;
/* 112 */           I0001Ioi1lo(value, !((Boolean) oIooliIO02.getValue()).booleanValue());
/* 130 */           oIooliIO02.setValue(Boolean.valueOf(oIooO1iiliI.I000II() == -3.0f));
/* 140 */           if (oIooO1iiliI.I000II() >= 0.0f) {
/* 165 */               I0000O(I00000oIO().I000II((long) (oIooO1iiliI.I000II() * I00000oIO().I00000oOI())));
                    } else if (oIooO1iiliI.I000II() == -3.0f) {
/* 177 */               I0000O(obj);
                    }
/* 180 */           this.I00l0I0l0lO1 = false;
/* 182 */           oIooO1iiliI.I000O01llI0(-1.0f);
                }

                @Override
                public final Object getValue() {
/* 3 */             return this.I00l0OO0IO.getValue();
                }

                public final String toString() {
/* 47 */            return "current value: " + this.I00l0OO0IO.getValue() + ", target: " + this.I00iiI.getValue() + ", spec: " + ((IlIoO1ilo1) this.I00iiO.getValue());
                }
            }
