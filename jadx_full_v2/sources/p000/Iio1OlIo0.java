            package p000;
            
            public final class Iio1OlIo0 implements Comparable {
                public static final IOO0o0I1l I00iiI = new IOO0o0I1l(11);
                public static final long I00iiO = ilI0IilIOi.I00000oOI(4611686018427387903L);
                public static final long I00iio = ilI0IilIOi.I00000oOI(-4611686018427387903L);
                public static final long I00ilI0I1 = 9223372036854759646L;
                public long I00iOIl;

                public static final long I00000oIO(long j, long j2) {
/* 4 */             long j3 = j2 / 1000000;
/* 6 */             long jI00000oIO = ilI0IilIOi.I00000oIO(j, j3);
/* 17 */            if (-4611686018426L > jI00000oIO || jI00000oIO >= 4611686018427L) {
/* 37 */                return ilI0IilIOi.I00000oOI(jI00000oIO);
                    }
/* 33 */            long j4 = ((jI00000oIO * 1000000) + (j2 - (j3 * 1000000))) << 1;
/* 34 */            int i = Iio1i11.I00000oIO;
/* 36 */            return j4;
                }

                public static final void I00000oOI(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
/* 1 */             sb.append(i);
/* 4 */             if (i2 != 0) {
/* 8 */                 sb.append('.');
/* 15 */                String strI00IO1 = OlOoOIi0o.I00IO1(i3, String.valueOf(i2));
/* 23 */                int i4 = -1;
                        int length = strI00IO1.length() - 1;
/* 25 */                if (length >= 0) {
                            while (true) {
                                int i5 = length - 1;
/* 35 */                        if (strI00IO1.charAt(length) != '0') {
/* 37 */                            i4 = length;
                                    break;
                                } else if (i5 < 0) {
                                    break;
                                } else {
/* 42 */                            length = i5;
                                }
                            }
                        }
/* 44 */                int i6 = i4 + 1;
/* 48 */                if (z || i6 >= 3) {
/* 59 */                    sb.append((CharSequence) strI00IO1, 0, ((i4 + 3) / 3) * 3);
                        } else {
/* 52 */                    sb.append((CharSequence) strI00IO1, 0, i6);
                        }
                    }
/* 62 */            sb.append(str);
                }

                public static final long I0000Il00O(long j) {
                    return ((((int) j) & 1) != 1 || I0000oI00(j)) ? I000II(j, Iio1llolooo.I00iiO) : j >> 1;
                }

                public static final int I0000O(long j) {
/* 5 */             if (I0000oI00(j)) {
/* 7 */                 return 0;
                    }
/* 22 */            return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
                }

                public static final boolean I0000oI00(long j) {
                    return j == I00iiO || j == I00iio;
                }

                public static final long I0001Ioi1lo(long j, long j2) {
/* 3 */             int i = ((int) j) & 1;
/* 6 */             if (i != (((int) j2) & 1)) {
                        return i == 1 ? I00000oIO(j >> 1, j2 >> 1) : I00000oIO(j2 >> 1, j >> 1);
                    }
/* 11 */            if (i == 0) {
/* 15 */                long j3 = (j >> 1) + (j2 >> 1);
/* 23 */                if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
/* 39 */                    return ilI0IilIOi.I00000oOI(j3 / 1000000);
                        }
/* 34 */                long j4 = j3 << 1;
/* 35 */                int i2 = Iio1i11.I00000oIO;
/* 37 */                return j4;
                    }
/* 46 */            long jI00000oIO = ilI0IilIOi.I00000oIO(j >> 1, j2 >> 1);
/* 57 */            if (jI00000oIO == 9223372036854759646L) {
/* 128 */               I000II.I000iOII("Summing infinite durations of different signs yields an undefined result.");
/* 131 */               return 0L;
                    }
/* 66 */            if (jI00000oIO == 4611686018427387903L || jI00000oIO == -4611686018427387903L) {
/* 121 */               return ilI0IilIOi.I00000oOI(jI00000oIO);
                    }
/* 85 */            if (-4611686018426L > jI00000oIO || jI00000oIO >= 4611686018427L) {
/* 116 */               return ilI0IilIOi.I00000oOI(lIiioliIlo.I0000O(jI00000oIO, -4611686018427387903L, 4611686018427387903L));
                    }
/* 97 */            long j5 = (jI00000oIO * 1000000) << 1;
/* 99 */            int i3 = Iio1i11.I00000oIO;
/* 101 */           return j5;
                }

                public static final long I000II(long j, Iio1llolooo iio1llolooo) {
/* 5 */             if (j == I00iiO) {
/* 7 */                 return Long.MAX_VALUE;
                    }
/* 17 */            if (j == I00iio) {
/* 19 */                return Long.MIN_VALUE;
                    }
/* 38 */            return iio1llolooo.I00iOIl.convert(j >> 1, ((((int) j) & 1) == 0 ? Iio1llolooo.I00iiI : Iio1llolooo.I00iiO).I00iOIl);
                }

                public static final long I000O01llI0(long j) {
/* 10 */            long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
/* 11 */            int i = Iio1i11.I00000oIO;
/* 49 */            return j2;
                }

                @Override
                public final int compareTo(Object obj) {
/* 3 */             long j = ((Iio1OlIo0) obj).I00iOIl;
/* 5 */             long j2 = this.I00iOIl;
/* 7 */             long j3 = j2 ^ j;
/* 13 */            if (j3 < 0 || (((int) j3) & 1) == 0) {
/* 35 */                return O0000Ioio00.I0001Ioi1lo(j2, j);
                    }
/* 27 */            int i = (((int) j2) & 1) - (((int) j) & 1);
                    return j2 < 0 ? -i : i;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Iio1OlIo0) && this.I00iOIl == ((Iio1OlIo0) obj).I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 1 */             long jI000O01llI0 = this.I00iOIl;
/* 7 */             if (jI000O01llI0 == 0) {
/* 9 */                 return "0s";
                    }
/* 16 */            if (jI000O01llI0 == I00iiO) {
/* 18 */                return "Infinity";
                    }
/* 25 */            if (jI000O01llI0 == I00iio) {
/* 27 */                return "-Infinity";
                    }
/* 30 */            int i = 0;
/* 36 */            boolean z = jI000O01llI0 < 0;
/* 39 */            StringBuilder sb = new StringBuilder();
/* 42 */            if (z) {
/* 46 */                sb.append('-');
                    }
/* 49 */            if (jI000O01llI0 < 0) {
/* 51 */                jI000O01llI0 = I000O01llI0(jI000O01llI0);
                    }
/* 57 */            long jI000II = I000II(jI000O01llI0, Iio1llolooo.I00io1l);
/* 78 */            int iI000II = I0000oI00(jI000O01llI0) ? 0 : (int) (I000II(jI000O01llI0, Iio1llolooo.I00ilO0) % 24);
/* 96 */            int iI000II2 = I0000oI00(jI000O01llI0) ? 0 : (int) (I000II(jI000O01llI0, Iio1llolooo.I00ilI0I1) % 60);
/* 112 */           int iI000II3 = I0000oI00(jI000O01llI0) ? 0 : (int) (I000II(jI000O01llI0, Iio1llolooo.I00iio) % 60);
/* 113 */           int iI0000O = I0000O(jI000O01llI0);
/* 123 */           boolean z2 = jI000II != 0;
/* 128 */           boolean z3 = iI000II != 0;
/* 133 */           boolean z4 = iI000II2 != 0;
/* 141 */           boolean z5 = (iI000II3 == 0 && iI0000O == 0) ? false : true;
/* 142 */           if (z2) {
/* 144 */               sb.append(jI000II);
/* 149 */               sb.append('d');
/* 152 */               i = 1;
                    }
/* 155 */           if (z3 || (z2 && (z4 || z5))) {
/* 163 */               int i2 = i + 1;
/* 165 */               if (i > 0) {
/* 167 */                   sb.append(' ');
                        }
/* 170 */               sb.append(iI000II);
/* 175 */               sb.append('h');
/* 178 */               i = i2;
                    }
/* 179 */           if (z4 || (z5 && (z3 || z2))) {
/* 187 */               int i3 = i + 1;
/* 189 */               if (i > 0) {
/* 191 */                   sb.append(' ');
                        }
/* 194 */               sb.append(iI000II2);
/* 199 */               sb.append('m');
/* 202 */               i = i3;
                    }
/* 203 */           if (z5) {
/* 205 */               int i4 = i + 1;
/* 207 */               if (i > 0) {
/* 209 */                   sb.append(' ');
                        }
/* 212 */               if (iI000II3 != 0 || z2 || z3 || z4) {
/* 270 */                   I00000oOI(sb, iI000II3, iI0000O, 9, "s", false);
                        } else if (iI0000O >= 1000000) {
/* 235 */                   I00000oOI(sb, iI0000O / 1000000, iI0000O % 1000000, 6, "ms", false);
                        } else if (iI0000O >= 1000) {
/* 251 */                   I00000oOI(sb, iI0000O / 1000, iI0000O % 1000, 3, "us", false);
                        } else {
/* 255 */                   sb.append(iI0000O);
/* 260 */                   sb.append("ns");
                        }
/* 273 */               i = i4;
                    }
/* 274 */           if (z && i > 1) {
/* 286 */               sb.insert(1, '(').append(')');
                    }
/* 289 */           return sb.toString();
                }
            }
