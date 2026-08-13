            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oiolo1I {
                public final OIooliIO0 I00000oIO;
                public final OIooliIO0 I00000oOI;
                public final IIo11l1iO I0000Il00O;
                public final long I0000O;
                public O0iOOo0Ii I0000oI00;
                public long I0001Ioi1lo;
                public float I000II;
                public float I000O01llI0;
                public long I000OOo1O;
                public long I000OiO;
                public float I000iOII;
                public OooIlilo I000l1;

                public Oiolo1I() {
/* 4 */             Boolean bool = Boolean.FALSE;
/* 10 */            this.I00000oIO = lOO00IiI0li.I00000oIO(bool);
/* 16 */            this.I00000oOI = lOO00IiI0li.I00000oIO(bool);
/* 20 */            IIo11l1iO iIo11l1iO = new IIo11l1iO();
/* 27 */            iIo11l1iO.I00iOIl = lOO00IiI0li.I00000oIO(bool);
/* 36 */            iIo11l1iO.I00iiI = new OIooO1iiliI(1.0f);
/* 42 */            iIo11l1iO.I00iiO = lOO00IiI0li.I00000oIO(bool);
/* 49 */            iIo11l1iO.I00iio = new OIooO1iiliI(1.0f);
/* 55 */            iIo11l1iO.I00ilI0I1 = lOO00IiI0li.I00000oIO(bool);
/* 57 */            long j = OoI0l01O.I00000oOI;
/* 67 */            iIo11l1iO.I00ilO0 = lOO00IiI0li.I00000oIO(OoI0l01O.I00000oIO(j));
/* 73 */            iIo11l1iO.I00io1l = lOO00IiI0li.I00000oIO(bool);
/* 75 */            long j2 = IOOiio0i.I000lI;
/* 85 */            iIo11l1iO.I00ioIO = lOO00IiI0li.I00000oIO(IOOiio0i.I00000oIO(j2));
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            this.I0000Il00O = iIo11l1iO;
/* 96 */            this.I0000O = OI0101io.I00000oIO();
/* 98 */            this.I0001Ioi1lo = j2;
/* 100 */           this.I000II = 1.0f;
/* 102 */           this.I000O01llI0 = 1.0f;
/* 104 */           this.I000OOo1O = j;
/* 108 */           this.I000OiO = 0L;
/* 110 */           this.I000iOII = 1.0f;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I110iOiOllO I00000oIO() {
                    float fFloatValue;
/* 6 */             if (!I0000Il00O()) {
/* 5 */                 return null;
                    }
/* 8 */             OooIlilo oooIlilo = this.I000l1;
/* 10 */            if (oooIlilo != null) {
/* 12 */                float fI00000oOI = oooIlilo.I00000oOI();
/* 24 */                Float fValueOf = Float.isNaN(fI00000oOI) ? null : Float.valueOf(fI00000oOI);
/* 34 */                fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                    }
/* 37 */            return new I110iOiOllO(fFloatValue);
                }

                public final I110ilOOl0io I00000oOI() {
/* 6 */             if (!I0000Il00O()) {
/* 5 */                 return null;
                    }
/* 10 */            float fI0000Il00O = OooIOilolOo.I0000Il00O(0L);
/* 14 */            Float fValueOf = Float.valueOf(fI0000Il00O);
/* 22 */            if (Float.isNaN(fI0000Il00O)) {
/* 25 */                fValueOf = null;
                    }
/* 34 */            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
/* 35 */            float fI0000O = OooIOilolOo.I0000O(0L);
/* 47 */            Float fValueOf2 = Float.isNaN(fI0000O) ? null : Float.valueOf(fI0000O);
/* 58 */            return new I110ilOOl0io(fFloatValue, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
                }

                public final boolean I0000Il00O() {
/* 9 */             return ((Boolean) this.I00000oOI.getValue()).booleanValue();
                }

                public final boolean I0000O() {
/* 9 */             return ((Boolean) this.I00000oIO.getValue()).booleanValue();
                }

                public final void I0000oI00(boolean z) {
/* 1 */             OIooliIO0 oIooliIO0 = this.I00000oIO;
/* 9 */             boolean zBooleanValue = ((Boolean) oIooliIO0.getValue()).booleanValue();
/* 13 */            OIooliIO0 oIooliIO02 = this.I00000oOI;
/* 15 */            if (zBooleanValue && !z) {
/* 21 */                oIooliIO02.setValue(Boolean.TRUE);
                    } else if (z) {
/* 29 */                oIooliIO02.setValue(Boolean.FALSE);
                    }
/* 36 */            oIooliIO0.setValue(Boolean.valueOf(z));
                }
            }
