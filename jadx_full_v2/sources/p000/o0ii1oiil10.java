            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class o0ii1oiil10 {
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public boolean I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public long I000II;
                public long I000O01llI0;
                public boolean I000OOo1O;
                public float I000OiO;
                public float I000iOII;
                public short I000l1;

                public final o0il1lO01O0 I00000oIO() {
/* 5 */             if (this.I000l1 == 4095) {
/* 161 */               int i = this.I00000oIO;
/* 163 */               float f = this.I00000oOI;
/* 165 */               float f2 = this.I0000Il00O;
/* 167 */               boolean z = this.I0000O;
/* 169 */               float f3 = this.I0000oI00;
/* 171 */               float f4 = this.I0001Ioi1lo;
/* 173 */               long j = this.I000II;
/* 175 */               long j2 = this.I000O01llI0;
/* 177 */               boolean z2 = this.I000OOo1O;
/* 179 */               float f5 = this.I000OiO;
/* 181 */               float f6 = this.I000iOII;
/* 183 */               o0il1lO01O0 o0il1lo01o0 = new o0il1lO01O0();
/* 186 */               o0il1lo01o0.I00000oIO = i;
/* 188 */               o0il1lo01o0.I00000oOI = f;
/* 190 */               o0il1lo01o0.I0000Il00O = f2;
/* 192 */               o0il1lo01o0.I0000O = z;
/* 194 */               o0il1lo01o0.I0000oI00 = f3;
/* 196 */               o0il1lo01o0.I0001Ioi1lo = f4;
/* 198 */               o0il1lo01o0.I000II = j;
/* 200 */               o0il1lo01o0.I000O01llI0 = j2;
/* 202 */               o0il1lo01o0.I000OOo1O = z2;
/* 204 */               o0il1lo01o0.I000OiO = f5;
/* 206 */               o0il1lo01o0.I000iOII = f6;
/* 208 */               VarHandle.storeStoreFence();
/* 245 */               return o0il1lo01o0;
                    }
/* 9 */             StringBuilder sb = new StringBuilder();
/* 16 */            if ((this.I000l1 & 1) == 0) {
/* 20 */                sb.append(" recentFramesToCheck");
                    }
/* 27 */            if ((this.I000l1 & 2) == 0) {
/* 31 */                sb.append(" recentFramesContainingPredictedArea");
                    }
/* 38 */            if ((this.I000l1 & 4) == 0) {
/* 42 */                sb.append(" recentFramesIou");
                    }
/* 49 */            if ((this.I000l1 & 8) == 0) {
/* 53 */                sb.append(" maxCoverage");
                    }
/* 60 */            if ((this.I000l1 & 16) == 0) {
/* 64 */                sb.append(" useConfidenceScore");
                    }
/* 71 */            if ((this.I000l1 & 32) == 0) {
/* 75 */                sb.append(" lowerConfidenceScore");
                    }
/* 82 */            if ((this.I000l1 & 64) == 0) {
/* 86 */                sb.append(" higherConfidenceScore");
                    }
/* 93 */            if ((this.I000l1 & 128) == 0) {
/* 97 */                sb.append(" zoomIntervalInMillis");
                    }
/* 104 */           if ((this.I000l1 & 256) == 0) {
/* 108 */               sb.append(" resetIntervalInMillis");
                    }
/* 115 */           if ((this.I000l1 & 512) == 0) {
/* 119 */               sb.append(" enableZoomThreshold");
                    }
/* 126 */           if ((this.I000l1 & 1024) == 0) {
/* 130 */               sb.append(" zoomInThreshold");
                    }
/* 137 */           if ((this.I000l1 & 2048) == 0) {
/* 141 */               sb.append(" zoomOutThreshold");
                    }
/* 154 */           I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 157 */           return null;
                }
            }
