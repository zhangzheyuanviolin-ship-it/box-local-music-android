            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I0l1I0I0i10I {
                public Object I00000oIO;
                public Object I00000oOI;
                public float I0000Il00O;
                public I0l1OOl1l10 I0000O;

                public final void I00000oIO(float f, float f2) {
/* 1 */             I0l1OOl1l10 i0l1OOl1l10 = this.I0000O;
/* 5 */             OIooliIO0 oIooliIO0 = (OIooliIO0) i0l1OOl1l10.I000II;
/* 9 */             OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) i0l1OOl1l10.I000l1;
/* 11 */            float fI000II = oIooO1iiliI.I000II();
/* 15 */            oIooO1iiliI.I000O01llI0(f);
/* 22 */            ((OIooO1iiliI) i0l1OOl1l10.I000lI).I000O01llI0(f2);
/* 29 */            if (Float.isNaN(fI000II)) {
/* 332 */               return;
                    }
/* 41 */            boolean z = f >= fI000II;
/* 60 */            if (oIooO1iiliI.I000II() == i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(oIooliIO0.getValue())) {
/* 78 */                Object objI00000oOI = i0l1OOl1l10.I0000Il00O().I00000oOI(oIooO1iiliI.I000II() + (z ? 1.0f : -1.0f), z);
/* 82 */                if (objI00000oOI == null) {
/* 84 */                    objI00000oOI = oIooliIO0.getValue();
                        }
/* 88 */                if (z) {
/* 94 */                    this.I00000oIO = oIooliIO0.getValue();
/* 96 */                    this.I00000oOI = objI00000oOI;
                        } else {
/* 99 */                    this.I00000oIO = objI00000oOI;
/* 105 */                   this.I00000oOI = oIooliIO0.getValue();
                        }
                    } else {
/* 116 */               Object objI00000oOI2 = i0l1OOl1l10.I0000Il00O().I00000oOI(oIooO1iiliI.I000II(), false);
/* 120 */               if (objI00000oOI2 == null) {
/* 122 */                   objI00000oOI2 = oIooliIO0.getValue();
                        }
/* 134 */               Object objI00000oOI3 = i0l1OOl1l10.I0000Il00O().I00000oOI(oIooO1iiliI.I000II(), true);
/* 138 */               if (objI00000oOI3 == null) {
/* 140 */                   objI00000oOI3 = oIooliIO0.getValue();
                        }
/* 144 */               this.I00000oIO = objI00000oOI2;
/* 146 */               this.I00000oOI = objI00000oOI3;
                    }
/* 173 */           this.I0000Il00O = Math.abs(i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(this.I00000oIO) - i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(this.I00000oOI));
/* 203 */           if (Math.abs(oIooO1iiliI.I000II() - i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(oIooliIO0.getValue())) >= this.I0000Il00O / 2.0f) {
/* 210 */               Object value = z ? this.I00000oOI : this.I00000oIO;
/* 212 */               if (value == null) {
/* 214 */                   value = oIooliIO0.getValue();
                        }
/* 232 */               if (((Boolean) ((Function1) i0l1OOl1l10.I00000oIO).invoke(value)).booleanValue()) {
/* 234 */                   oIooliIO0.setValue(value);
                        }
                    }
                }
            }
