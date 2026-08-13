            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import java.util.Arrays;
            
            public final class l1lIII1IiI extends I01OlIoIl implements Comparable {
                public static final Parcelable.Creator<l1lIII1IiI> CREATOR = new iolIll1o(8);
                public String I00iOIl;
                public long I00iiI;
                public boolean I00iiO;
                public double I00iio;
                public String I00ilI0I1;
                public byte[] I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;

                public final void I00000oOI(StringBuilder sb) {
/* 3 */             sb.append("Flag(");
/* 6 */             String str = this.I00iOIl;
/* 8 */             sb.append(str);
/* 13 */            sb.append(", ");
/* 16 */            int i = this.I00io1l;
/* 19 */            if (i == 1) {
/* 131 */               sb.append(this.I00iiI);
                    } else if (i == 2) {
/* 125 */               sb.append(this.I00iiO);
                    } else if (i == 3) {
/* 119 */               sb.append(this.I00iio);
                    } else if (i == 4) {
/* 102 */               sb.append("'");
/* 105 */               String str2 = this.I00ilI0I1;
/* 107 */               lII0I0I000I.I000II(str2);
/* 110 */               sb.append(str2);
/* 113 */               sb.append("'");
                    } else {
/* 33 */                if (i != 5) {
/* 77 */                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
/* 82 */                    sb2.append("Invalid type: ");
/* 85 */                    sb2.append(str);
/* 88 */                    sb2.append(", ");
/* 91 */                    sb2.append(i);
/* 101 */                   throw new AssertionError(sb2.toString());
                        }
/* 35 */                sb.append("'");
/* 38 */                byte[] bArr = this.I00ilO0;
/* 40 */                lII0I0I000I.I000II(bArr);
/* 47 */                sb.append(Base64.encodeToString(bArr, 3));
/* 50 */                sb.append("'");
                    }
/* 134 */           sb.append(", ");
/* 137 */           sb.append(i);
/* 140 */           sb.append(", ");
/* 145 */           sb.append(this.I00ioIO);
/* 148 */           sb.append(", ");
/* 153 */           sb.append(this.I00l0I0l0lO1);
/* 158 */           sb.append(")");
                }

                /* JADX WARN: Removed duplicated region for block: B:64:0x00a3 A[RETURN] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int compareTo(Object obj) {
/* 1 */             l1lIII1IiI l1liii1iii = (l1lIII1IiI) obj;
/* 7 */             int iCompareTo = this.I00iOIl.compareTo(l1liii1iii.I00iOIl);
/* 11 */            if (iCompareTo != 0) {
/* 13 */                return iCompareTo;
                    }
/* 14 */            int i = this.I00io1l;
/* 16 */            int i2 = l1liii1iii.I00io1l;
/* 29 */            int i3 = i < i2 ? -1 : i != i2 ? 1 : 0;
/* 30 */            if (i3 != 0) {
/* 32 */                return i3;
                    }
/* 33 */            if (i == 1) {
/* 152 */               long j = this.I00iiI;
/* 154 */               long j2 = l1liii1iii.I00iiI;
/* 158 */               if (j >= j2) {
/* 161 */                   if (j == j2) {
/* 19 */                        return 0;
                            }
                        }
                    }
/* 36 */            if (i == 2) {
/* 142 */               boolean z = this.I00iiO;
/* 146 */               if (z != l1liii1iii.I00iiO) {
                            return z ? 1 : -1;
                        }
/* 19 */                return 0;
                    }
/* 39 */            if (i == 3) {
/* 137 */               return Double.compare(this.I00iio, l1liii1iii.I00iio);
                    }
/* 42 */            if (i == 4) {
/* 115 */               String str = this.I00ilI0I1;
/* 117 */               String str2 = l1liii1iii.I00ilI0I1;
/* 119 */               if (str != str2) {
/* 122 */                   if (str != null) {
/* 125 */                       if (str2 != null) {
/* 128 */                           return str.compareTo(str2);
                                }
                            }
                        }
/* 19 */                return 0;
                    }
/* 45 */            if (i != 5) {
/* 111 */               I000II.I000O01llI0(Oi010OO0.I00100l0(i, "Invalid enum value: ", new StringBuilder(String.valueOf(i).length() + 20)));
/* 19 */                return 0;
                    }
/* 47 */            byte[] bArr = this.I00ilO0;
/* 49 */            byte[] bArr2 = l1liii1iii.I00ilO0;
/* 51 */            if (bArr != bArr2) {
/* 55 */                if (bArr != null) {
/* 59 */                    if (bArr2 != null) {
/* 63 */                        int i4 = 0;
                                while (true) {
/* 64 */                            int length = bArr2.length;
/* 65 */                            int length2 = bArr.length;
/* 70 */                            if (i4 >= Math.min(length2, length)) {
/* 83 */                                if (length2 < length) {
/* 18 */                                    return -1;
                                        }
                                        return length2 != length ? 1 : 0;
                                    }
/* 76 */                            int i5 = bArr[i4] - bArr2[i4];
/* 77 */                            if (i5 != 0) {
/* 79 */                                return i5;
                                    }
/* 80 */                            i4++;
                                }
                            }
                        }
                    }
/* 19 */            return 0;
                }

                public final boolean equals(Object obj) {
                    int i;
/* 4 */             if (obj instanceof l1lIII1IiI) {
/* 6 */                 l1lIII1IiI l1liii1iii = (l1lIII1IiI) obj;
/* 16 */                if (ll0IoOO1io.I00000oIO(this.I00iOIl, l1liii1iii.I00iOIl) && (i = this.I00io1l) == l1liii1iii.I00io1l && this.I00ioIO == l1liii1iii.I00ioIO && this.I00l0I0l0lO1 == l1liii1iii.I00l0I0l0lO1) {
/* 38 */                    if (i == 1) {
                                return this.I00iiI == l1liii1iii.I00iiI;
                            }
/* 41 */                    if (i == 2) {
                                return this.I00iiO == l1liii1iii.I00iiO;
                            }
/* 44 */                    if (i == 3) {
                                return this.I00iio == l1liii1iii.I00iio;
                            }
/* 47 */                    if (i == 4) {
/* 90 */                        return ll0IoOO1io.I00000oIO(this.I00ilI0I1, l1liii1iii.I00ilI0I1);
                            }
/* 50 */                    if (i == 5) {
/* 56 */                        return Arrays.equals(this.I00ilO0, l1liii1iii.I00ilO0);
                            }
/* 82 */                    I000II.I000O01llI0(Oi010OO0.I00100l0(i, "Invalid enum value: ", new StringBuilder(String.valueOf(i).length() + 20)));
/* 3 */                     return false;
                        }
                    }
/* 3 */             return false;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             I00000oOI(sb);
/* 9 */             return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 8 */             boolean z = str == null;
/* 11 */            int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 15 */            if (!z) {
/* 18 */                lO0IioIooIl.I000OiO(parcel, 2, str);
                    }
/* 21 */            long j = this.I00iiI;
/* 29 */            if (j != 0) {
/* 32 */                lO0IioIooIl.I000oI1ioi(parcel, 3, 8);
/* 35 */                parcel.writeLong(j);
                    }
/* 41 */            if (this.I00iiO) {
/* 43 */                lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 46 */                parcel.writeInt(1);
                    }
/* 49 */            double d = this.I00iio;
/* 55 */            if (d != 0.0d) {
/* 58 */                lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 61 */                parcel.writeDouble(d);
                    }
/* 64 */            String str2 = this.I00ilI0I1;
/* 66 */            if (str2 != null) {
/* 70 */                lO0IioIooIl.I000OiO(parcel, 6, str2);
                    }
/* 73 */            byte[] bArr = this.I00ilO0;
/* 75 */            if (bArr != null) {
/* 79 */                lO0IioIooIl.I00000oOI(parcel, 7, bArr);
                    }
/* 82 */            int i2 = this.I00io1l;
/* 84 */            if (i2 != 0) {
/* 87 */                lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 90 */                parcel.writeInt(i2);
                    }
/* 93 */            int i3 = this.I00ioIO;
/* 95 */            if (i3 != 0) {
/* 100 */               lO0IioIooIl.I000oI1ioi(parcel, 9, 4);
/* 103 */               parcel.writeInt(i3);
                    }
/* 106 */           int i4 = this.I00l0I0l0lO1;
/* 108 */           if (i4 != 0) {
/* 113 */               lO0IioIooIl.I000oI1ioi(parcel, 10, 4);
/* 116 */               parcel.writeInt(i4);
                    }
/* 119 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
