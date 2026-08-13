            package p000;
            
            public final class OO0ioOIlo implements OOlI0i1lo {
                public OlI1iil1l0 I00iOIl;
                public III1oo00i1li I00iiI;
                public Oii1O1l I00iiO;
                public int I00iio;
                public boolean I00ilI0I1;
                public long I00ilO0;

                @Override
                public final long I00II0oii1o(III1oo00i1li iII1oo00i1li, long j) {
                    Oii1O1l oii1O1l;
                    Oii1O1l oii1O1l2;
/* 5 */             if (this.I00ilI0I1) {
/* 183 */               I000II.I001IO000("Source is closed.");
/* 3 */                 return 0L;
                    }
/* 9 */             if (j < 0) {
/* 177 */               I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 3 */                 return 0L;
                    }
/* 11 */            Oii1O1l oii1O1l3 = this.I00iiO;
/* 13 */            III1oo00i1li iII1oo00i1li2 = this.I00iiI;
/* 15 */            if (oii1O1l3 != null && (oii1O1l3 != (oii1O1l2 = iII1oo00i1li2.I00iOIl) || this.I00iio != oii1O1l2.I00000oOI)) {
/* 30 */                I000II.I001IO000("Peek source is invalid because upstream source was used");
/* 3 */                 return 0L;
                    }
/* 34 */            if (j == 0) {
/* 3 */                 return 0L;
                    }
/* 48 */            if (!this.I00iOIl.I000lI(this.I00ilO0 + 1)) {
/* 50 */                return -1L;
                    }
/* 55 */            if (this.I00iiO == null && (oii1O1l = iII1oo00i1li2.I00iOIl) != null) {
/* 61 */                this.I00iiO = oii1O1l;
/* 65 */                this.I00iio = oii1O1l.I00000oOI;
                    }
/* 72 */            long jMin = Math.min(j, iII1oo00i1li2.I00iiO - this.I00ilO0);
/* 76 */            long j2 = this.I00ilO0;
/* 78 */            long j3 = j2 + jMin;
/* 82 */            iO1i0iI.I00000oIO(iII1oo00i1li2.I00iiO, j2, j3);
/* 87 */            if (j2 != j3) {
/* 90 */                long j4 = j3 - j2;
                        iII1oo00i1li.I00iiO += j4;
/* 96 */                Oii1O1l oii1O1l4 = iII1oo00i1li2.I00iOIl;
                        while (true) {
/* 102 */                   long j5 = oii1O1l4.I0000Il00O - oii1O1l4.I00000oOI;
/* 106 */                   if (j2 < j5) {
                                break;
                            }
/* 108 */                   j2 -= j5;
/* 109 */                   oii1O1l4 = oii1O1l4.I0001Ioi1lo;
                        }
/* 114 */               while (j4 > 0) {
/* 116 */                   Oii1O1l oii1O1lI0000O = oii1O1l4.I0000O();
/* 123 */                   int i = oii1O1lI0000O.I00000oOI + ((int) j2);
/* 124 */                   oii1O1lI0000O.I00000oOI = i;
/* 134 */                   oii1O1lI0000O.I0000Il00O = Math.min(i + ((int) j4), oii1O1lI0000O.I0000Il00O);
/* 138 */                   if (iII1oo00i1li.I00iOIl == null) {
/* 140 */                       iII1oo00i1li.I00iOIl = oii1O1lI0000O;
/* 142 */                       iII1oo00i1li.I00iiI = oii1O1lI0000O;
                            } else {
/* 147 */                       iII1oo00i1li.I00iiI.I0000Il00O(oii1O1lI0000O);
/* 150 */                       iII1oo00i1li.I00iiI = oii1O1lI0000O;
                            }
/* 158 */                   j4 -= oii1O1lI0000O.I0000Il00O - oii1O1lI0000O.I00000oOI;
/* 159 */                   oii1O1l4 = oii1O1l4.I0001Ioi1lo;
/* 161 */                   j2 = 0;
                        }
                    }
                    this.I00ilO0 += jMin;
/* 168 */           return jMin;
                }

                @Override
                public final void close() {
/* 2 */             this.I00ilI0I1 = true;
                }
            }
