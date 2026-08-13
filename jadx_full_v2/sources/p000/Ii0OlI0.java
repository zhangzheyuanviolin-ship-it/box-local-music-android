            package p000;

            import android.os.SystemClock;
            
            public final class Ii0OlI0 extends OIoOo11 {
                public OIoOo11 I00ilI0I1;
                public OIoOo11 I00ilO0;
                public IOoOOI1ii I00io1l;
                public int I00ioIO;
                public boolean I00l0I0l0lO1;
                public OIooi1iOiOol I00l0OO0IO;
                public long I00li1OI;
                public boolean I00ll1;
                public OIooO1iiliI I00lli11;
                public OIooliIO0 I00lll10;

                @Override
                public final void I00000oIO(float f) {
/* 3 */             this.I00lli11.I000O01llI0(f);
                }

                @Override
                public final void I0000Il00O(IOOil0 iOOil0) {
/* 3 */             this.I00lll10.setValue(iOOil0);
                }

                @Override
                public final long I000OOo1O() {
/* 1 */             OIoOo11 oIoOo11 = this.I00ilI0I1;
/* 12 */            long jI000OOo1O = oIoOo11 != null ? oIoOo11.I000OOo1O() : 0L;
/* 13 */            OIoOo11 oIoOo112 = this.I00ilO0;
/* 17 */            long jI000OOo1O2 = oIoOo112 != null ? oIoOo112.I000OOo1O() : 0L;
/* 34 */            boolean z = jI000OOo1O != 9205357640488583168L;
/* 37 */            boolean z2 = jI000OOo1O2 != 9205357640488583168L;
/* 40 */            if (z && z2) {
/* 89 */                return (Float.floatToRawIntBits(Math.max(Ol0i1I.I0000oI00(jI000OOo1O), Ol0i1I.I0000oI00(jI000OOo1O2))) << 32) | (Float.floatToRawIntBits(Math.max(Ol0i1I.I0000Il00O(jI000OOo1O), Ol0i1I.I0000Il00O(jI000OOo1O2))) & 4294967295L);
                    }
/* 21 */            return 9205357640488583168L;
                }

                @Override
                public final void I000OiO(IilloIOOO0i iilloIOOO0i) {
/* 1 */             OIooi1iOiOol oIooi1iOiOol = this.I00l0OO0IO;
/* 3 */             OIoOo11 oIoOo11 = this.I00ilO0;
/* 5 */             OIooO1iiliI oIooO1iiliI = this.I00lli11;
/* 9 */             if (this.I00ll1) {
/* 15 */                I000iOII(iilloIOOO0i, oIoOo11, oIooO1iiliI.I000II());
/* 18 */                return;
                    }
/* 19 */            long jUptimeMillis = SystemClock.uptimeMillis();
/* 23 */            long j = this.I00li1OI;
/* 29 */            if (j == -1) {
/* 31 */                this.I00li1OI = jUptimeMillis;
/* 33 */                j = jUptimeMillis;
                    }
/* 39 */            float f = (jUptimeMillis - j) / this.I00ioIO;
/* 51 */            float fI000II = oIooO1iiliI.I000II() * lIiioliIlo.I00000oOI(f, 0.0f, 1.0f);
/* 62 */            float fI000II2 = this.I00l0I0l0lO1 ? oIooO1iiliI.I000II() - fI000II : oIooO1iiliI.I000II();
/* 74 */            this.I00ll1 = f >= 1.0f;
/* 78 */            I000iOII(iilloIOOO0i, this.I00ilI0I1, fI000II2);
/* 81 */            I000iOII(iilloIOOO0i, oIoOo11, fI000II);
/* 86 */            if (this.I00ll1) {
/* 89 */                this.I00ilI0I1 = null;
                    } else {
/* 97 */                oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                    }
                }

                public final void I000iOII(IilloIOOO0i iilloIOOO0i, OIoOo11 oIoOo11, float f) {
/* 1 */             OIooliIO0 oIooliIO0 = this.I00lll10;
/* 3 */             if (oIoOo11 == null || f <= 0.0f) {
/* 408 */               return;
                    }
/* 12 */            long jI0000oI00 = iilloIOOO0i.I0000oI00();
/* 16 */            long jI000OOo1O = oIoOo11.I000OOo1O();
/* 56 */            long jI00000oIO = (jI000OOo1O == 9205357640488583168L || Ol0i1I.I0001Ioi1lo(jI000OOo1O) || jI0000oI00 == 9205357640488583168L || Ol0i1I.I0001Ioi1lo(jI0000oI00)) ? jI0000oI00 : lO0l1ooI0lo1.I00000oIO(jI000OOo1O, this.I00io1l.I00000oOI(jI000OOo1O, jI0000oI00));
/* 63 */            if (jI0000oI00 == 9205357640488583168L || Ol0i1I.I0001Ioi1lo(jI0000oI00)) {
/* 83 */                oIoOo11.I000II(iilloIOOO0i, jI00000oIO, f, (IOOil0) oIooliIO0.getValue());
/* 86 */                return;
                    }
/* 98 */            float fI0000oI00 = (Ol0i1I.I0000oI00(jI0000oI00) - Ol0i1I.I0000oI00(jI00000oIO)) / 2.0f;
/* 108 */           float fI0000Il00O = (Ol0i1I.I0000Il00O(jI0000oI00) - Ol0i1I.I0000Il00O(jI00000oIO)) / 2.0f;
/* 117 */           ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00O0o1oo(fI0000oI00, fI0000Il00O, fI0000oI00, fI0000Il00O);
/* 131 */           oIoOo11.I000II(iilloIOOO0i, jI00000oIO, f, (IOOil0) oIooliIO0.getValue());
/* 142 */           float f2 = -fI0000oI00;
/* 143 */           float f3 = -fI0000Il00O;
/* 144 */           ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00O0o1oo(f2, f3, f2, f3);
                }
            }
