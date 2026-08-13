            package p000;

            import java.io.Serializable;
            
            public final class Ioo1Ololi1 implements Comparable, Serializable {
                public static final Ioo1Ololi1 I00iiO = new Ioo1Ololi1(0, -31557014167219200L);
                public static final Ioo1Ololi1 I00iio = new Ioo1Ololi1(999999999, 31556889864403199L);
                public final long I00iOIl;
                public final int I00iiI;

                public Ioo1Ololi1(int i, long j) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = i;
/* 15 */            if (-31557014167219200L > j || j >= 31556889864403200L) {
/* 29 */                I000II.I000iOII("Instant exceeds minimum or maximum instant");
/* 89 */                throw null;
                    }
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             Ioo1Ololi1 ioo1Ololi1 = (Ioo1Ololi1) obj;
/* 7 */             int iI0001Ioi1lo = O0000Ioio00.I0001Ioi1lo(this.I00iOIl, ioo1Ololi1.I00iOIl);
                    return iI0001Ioi1lo != 0 ? iI0001Ioi1lo : O0000Ioio00.I0000oI00(this.I00iiI, ioo1Ololi1.I00iiI);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 26 */                return true;
                    }
/* 5 */             if (!(obj instanceof Ioo1Ololi1)) {
/* 24 */                return false;
                    }
/* 7 */             Ioo1Ololi1 ioo1Ololi1 = (Ioo1Ololi1) obj;
                    return this.I00iOIl == ioo1Ololi1.I00iOIl && this.I00iiI == ioo1Ololi1.I00iiI;
                }

                public final int hashCode() {
/* 11 */            return (this.I00iiI * 51) + Long.hashCode(this.I00iOIl);
                }

                public final String toString() {
                    long j;
                    int[] iArr;
/* 5 */             StringBuilder sb = new StringBuilder();
/* 8 */             long j2 = this.I00iOIl;
/* 13 */            long j3 = j2 / 86400;
/* 23 */            if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
                        j3--;
                    }
/* 32 */            long j4 = j2 % 86400;
/* 43 */            int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
/* 47 */            long j5 = 719468 + j3;
/* 55 */            if (j5 < 0) {
/* 65 */                long j6 = ((j3 + 719469) / 146097) - 1;
/* 67 */                j = j6 * 400;
/* 71 */                j5 += (-j6) * 146097;
                    } else {
/* 73 */                j = 0;
                    }
/* 81 */            long j7 = ((400 * j5) + 591) / 146097;
/* 102 */           long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
/* 106 */           if (j8 < 0) {
                        j7--;
/* 119 */               j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
                    }
/* 125 */           int i2 = (int) j8;
/* 130 */           int i3 = ((i2 * 5) + 2) / 153;
/* 137 */           int i4 = ((i3 + 2) % 12) + 1;
/* 145 */           int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
/* 150 */           int i6 = (int) (j7 + j + (i3 / 10));
/* 151 */           int i7 = i / 3600;
/* 155 */           int i8 = i - (i7 * 3600);
/* 156 */           int i9 = i8 / 60;
/* 160 */           int i10 = i8 - (i9 * 60);
/* 167 */           int i11 = 0;
/* 170 */           if (Math.abs(i6) < 1000) {
/* 174 */               StringBuilder sb2 = new StringBuilder();
/* 177 */               if (i6 >= 0) {
/* 180 */                   sb2.append(i6 + 10000);
/* 183 */                   sb2.deleteCharAt(0);
                        } else {
/* 188 */                   sb2.append(i6 - 10000);
/* 191 */                   sb2.deleteCharAt(1);
                        }
/* 194 */               sb.append((CharSequence) sb2);
                    } else {
/* 198 */               if (i6 >= 10000) {
/* 202 */                   sb.append('+');
                        }
/* 205 */               sb.append(i6);
                    }
/* 210 */           sb.append('-');
/* 213 */           iIo1li.I00000oIO(sb, sb, i4);
/* 216 */           sb.append('-');
/* 219 */           iIo1li.I00000oIO(sb, sb, i5);
/* 224 */           sb.append('T');
/* 227 */           iIo1li.I00000oIO(sb, sb, i7);
/* 232 */           sb.append(':');
/* 235 */           iIo1li.I00000oIO(sb, sb, i9);
/* 238 */           sb.append(':');
/* 241 */           iIo1li.I00000oIO(sb, sb, i10);
/* 244 */           int i12 = this.I00iiI;
/* 246 */           if (i12 != 0) {
/* 250 */               sb.append('.');
                        while (true) {
/* 253 */                   int i13 = i11 + 1;
/* 255 */                   iArr = iIo1li.I00000oIO;
/* 261 */                   if (i12 % iArr[i13] != 0) {
                                break;
                            }
/* 263 */                   i11 = i13;
                        }
/* 267 */               int i14 = i11 - (i11 % 3);
/* 284 */               sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
                    }
/* 289 */           sb.append('Z');
/* 292 */           return sb.toString();
                }
            }
