            package p000;

            import java.nio.ByteBuffer;
            import java.util.Arrays;
            import java.util.HashMap;
            
            public final class Iiool010Oi {
                public final int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;

                public Iiool010Oi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public void I00000oIO() {
/* 2 */             this.I00000oOI = 1;
/* 8 */             this.I0001Ioi1lo = (O1liIoooO) this.I0000oI00;
/* 11 */            this.I0000O = 0;
                }

                public boolean I00000oOI() {
/* 7 */             O1liI1Ii o1liI1IiI00000oOI = ((O1liIoooO) this.I0001Ioi1lo).I00000oOI.I00000oOI();
/* 12 */            int iI00000oIO = o1liI1IiI00000oOI.I00000oIO(6);
                    return !(iI00000oIO == 0 || ((ByteBuffer) o1liI1IiI00000oOI.I00iiI).get(iI00000oIO + o1liI1IiI00000oOI.I00iOIl) == 0) || this.I0000Il00O == 65039;
                }

                public void I0000Il00O() {
                    switch (this.I00000oIO) {
                        case 1:
/* 76 */                    if (this.I0000Il00O != 0) {
/* 83 */                        HashMap map = ((iOiI110l1OI) this.I000II).I0000O;
/* 87 */                        int[] iArr = (int[]) this.I0000oI00;
/* 101 */                       iOiI110l1OI ioii110l1oi = (iOiI110l1OI) map.get(Integer.valueOf(iArr[this.I00000oOI]));
                                while (true) {
/* 108 */                           int i = (ioii110l1oi.I00000oOI - ioii110l1oi.I00000oIO) + 1;
/* 110 */                           int i2 = this.I0000Il00O;
/* 112 */                           if (i > i2) {
                                        break;
                                    } else {
/* 116 */                               int i3 = this.I00000oOI + i;
/* 117 */                               this.I00000oOI = i3;
/* 119 */                               this.I000II = ioii110l1oi;
/* 121 */                               int i4 = i2 - i;
/* 122 */                               this.I0000Il00O = i4;
/* 124 */                               if (i4 > 0) {
/* 138 */                                   ioii110l1oi = (iOiI110l1OI) ioii110l1oi.I0000O.get(Integer.valueOf(iArr[i3]));
                                        }
                                    }
                                }
                            }
                            break;
                        default:
/* 8 */                     if (this.I0000Il00O != 0) {
/* 15 */                        HashMap map2 = ((o0Oi1I) this.I000II).I0000O;
/* 19 */                        int[] iArr2 = (int[]) this.I0000oI00;
/* 33 */                        o0Oi1I o0oi1i = (o0Oi1I) map2.get(Integer.valueOf(iArr2[this.I00000oOI]));
                                while (true) {
/* 40 */                            int i5 = (o0oi1i.I00000oOI - o0oi1i.I00000oIO) + 1;
/* 42 */                            int i6 = this.I0000Il00O;
/* 44 */                            if (i5 > i6) {
                                        break;
                                    } else {
/* 48 */                                int i7 = this.I00000oOI + i5;
/* 49 */                                this.I00000oOI = i7;
/* 51 */                                this.I000II = o0oi1i;
/* 53 */                                int i8 = i6 - i5;
/* 54 */                                this.I0000Il00O = i8;
/* 56 */                                if (i8 > 0) {
/* 70 */                                    o0oi1i = (o0Oi1I) o0oi1i.I0000O.get(Integer.valueOf(iArr2[i7]));
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }

                public void I0000O() {
                    switch (this.I00000oIO) {
                        case 1:
/* 49 */                    iOiI110l1OI ioii110l1oi = ((iOiI110l1OI) this.I000II).I0000Il00O;
/* 51 */                    if (ioii110l1oi != null) {
/* 53 */                        this.I000II = ioii110l1oi;
                            } else {
/* 60 */                        this.I000II = (iOiI110l1OI) this.I0001Ioi1lo;
/* 62 */                        int i = this.I0000Il00O;
/* 64 */                        if (i > 0) {
/* 68 */                            this.I0000Il00O = i - 1;
                                }
/* 72 */                        if (this.I0000O > 0) {
                                    this.I00000oOI++;
                                }
                            }
/* 80 */                    I0000Il00O();
                            break;
                        default:
/* 10 */                    o0Oi1I o0oi1i = ((o0Oi1I) this.I000II).I0000Il00O;
/* 12 */                    if (o0oi1i != null) {
/* 14 */                        this.I000II = o0oi1i;
                            } else {
/* 21 */                        this.I000II = (o0Oi1I) this.I0001Ioi1lo;
/* 23 */                        int i2 = this.I0000Il00O;
/* 25 */                        if (i2 > 0) {
/* 29 */                            this.I0000Il00O = i2 - 1;
                                }
/* 33 */                        if (this.I0000O > 0) {
                                    this.I00000oOI++;
                                }
                            }
/* 41 */                    I0000Il00O();
                            break;
                    }
                }

                public void I0000oI00(iOiI110l1OI ioii110l1oi, StringBuilder sb) {
/* 15 */            for (iOiI110l1OI ioii110l1oi2 : ioii110l1oi.I0000O.values()) {
/* 25 */                sb.append("  ");
/* 28 */                sb.append(ioii110l1oi);
/* 33 */                sb.append(" -> ");
/* 36 */                sb.append(ioii110l1oi2);
/* 41 */                sb.append(" [label=\"");
/* 46 */                int[] iArr = (int[]) this.I0000oI00;
/* 67 */                sb.append(Arrays.toString(Arrays.copyOfRange(iArr, ioii110l1oi2.I00000oIO, Math.min(iArr.length, ioii110l1oi2.I00000oOI + 1))));
/* 72 */                sb.append("\"]\n");
/* 75 */                I0000oI00(ioii110l1oi2, sb);
                    }
                }

                public void I0001Ioi1lo(o0Oi1I o0oi1i, StringBuilder sb) {
/* 15 */            for (o0Oi1I o0oi1i2 : o0oi1i.I0000O.values()) {
/* 25 */                sb.append("  ");
/* 28 */                sb.append(o0oi1i);
/* 33 */                sb.append(" -> ");
/* 36 */                sb.append(o0oi1i2);
/* 41 */                sb.append(" [label=\"");
/* 46 */                int[] iArr = (int[]) this.I0000oI00;
/* 67 */                sb.append(Arrays.toString(Arrays.copyOfRange(iArr, o0oi1i2.I00000oIO, Math.min(iArr.length, o0oi1i2.I00000oOI + 1))));
/* 72 */                sb.append("\"]\n");
/* 75 */                I0001Ioi1lo(o0oi1i2, sb);
                    }
                }

                public boolean I000II(int i, int i2, int i3, int i4) {
                    switch (this.I00000oIO) {
                        case 1:
/* 49 */                    if (i >= 0 && i3 >= 0) {
/* 56 */                        int[] iArr = (int[]) this.I0000oI00;
/* 58 */                        int length = iArr.length;
/* 59 */                        int iMin = Math.min(length, i2);
/* 70 */                        if (iMin - i == Math.min(length, i4) - i3) {
/* 73 */                            for (int i5 = i; i5 <= iMin; i5++) {
/* 82 */                                if (iArr[i5] != iArr[(i3 + i5) - i]) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
/* 8 */                     if (i >= 0 && i3 >= 0) {
/* 15 */                        int[] iArr2 = (int[]) this.I0000oI00;
/* 17 */                        int length2 = iArr2.length;
/* 18 */                        int iMin2 = Math.min(length2, i2);
/* 29 */                        if (iMin2 - i == Math.min(length2, i4) - i3) {
/* 32 */                            for (int i6 = i; i6 <= iMin2; i6++) {
/* 41 */                                if (iArr2[i6] != iArr2[(i3 + i6) - i]) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                    }
/* 4 */             return true;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 37 */                    StringBuilder sb = new StringBuilder("digraph {\n");
/* 44 */                    I0000oI00((iOiI110l1OI) this.I0001Ioi1lo, sb);
/* 47 */                    sb.append("}");
/* 50 */                    return sb.toString();
                        case 2:
/* 17 */                    StringBuilder sb2 = new StringBuilder("digraph {\n");
/* 24 */                    I0001Ioi1lo((o0Oi1I) this.I0001Ioi1lo, sb2);
/* 27 */                    sb2.append("}");
/* 30 */                    return sb2.toString();
                        default:
/* 10 */                    return super.toString();
                    }
                }
            }
