            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import p000.OoOil11Ol1o;
            
            final class zzafe extends zzafh {
                private final byte[] zzg;
                private int zzh;
                private int zzi;
                private int zzj;
                private int zzk;
                private int zzl;

                public zzafe(byte[] bArr, int i, int i2, boolean z, zzafg zzafgVar) {
/* 2 */             super(null);
/* 8 */             this.zzl = Integer.MAX_VALUE;
/* 10 */            this.zzg = bArr;
/* 12 */            this.zzh = i2;
/* 15 */            this.zzj = 0;
                }

                private final void zzO() {
/* 5 */             int i = this.zzh + this.zzi;
/* 6 */             this.zzh = i;
/* 8 */             int i2 = this.zzl;
/* 10 */            if (i <= i2) {
/* 21 */                this.zzi = 0;
/* 55 */                return;
                    }
/* 12 */            int i3 = i - i2;
/* 14 */            this.zzi = i3;
/* 17 */            this.zzh = i - i3;
                }

                @Override
                public final void zzA(int i) {
/* 1 */             this.zzl = i;
/* 3 */             zzO();
                }

                public final void zzB(int i) throws zzagr {
/* 1 */             if (i >= 0) {
/* 3 */                 int i2 = this.zzh;
/* 5 */                 int i3 = this.zzj;
/* 8 */                 if (i <= i2 - i3) {
/* 12 */                    this.zzj = i3 + i;
/* 14 */                    return;
                        }
                    }
/* 15 */            if (i < 0) {
/* 19 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    } else {
/* 25 */                OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                @Override
                public final boolean zzC() {
                    return this.zzj == this.zzh;
                }

                @Override
                public final boolean zzD() {
                    return zzr() != 0;
                }

                @Override
                public final boolean zzE(int i) throws zzagr {
/* 1 */             int i2 = i & 7;
/* 3 */             int i3 = 0;
/* 5 */             if (i2 == 0) {
/* 67 */                if (this.zzh - this.zzj < 10) {
/* 91 */                    while (i3 < 10) {
/* 97 */                        if (zza() < 0) {
/* 99 */                            i3++;
                                }
                            }
/* 103 */                   OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered a malformed varint.");
/* 28 */                    return false;
                        }
/* 69 */                while (i3 < 10) {
/* 71 */                    byte[] bArr = this.zzg;
/* 73 */                    int i4 = this.zzj;
/* 77 */                    this.zzj = i4 + 1;
/* 81 */                    if (bArr[i4] < 0) {
/* 84 */                        i3++;
                            }
                        }
/* 87 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered a malformed varint.");
/* 28 */                return false;
/* 4 */                 return true;
                    }
/* 7 */             if (i2 == 1) {
/* 54 */                zzB(8);
/* 4 */                 return true;
                    }
/* 10 */            if (i2 == 2) {
/* 48 */                zzB(zzj());
/* 4 */                 return true;
                    }
/* 14 */            if (i2 == 3) {
/* 34 */                zzN();
/* 40 */                zzz(((i >>> 3) << 3) | 4);
/* 4 */                 return true;
                    }
/* 16 */            if (i2 == 4) {
/* 30 */                zzM();
/* 3 */                 return false;
                    }
/* 19 */            if (i2 == 5) {
/* 21 */                zzB(4);
/* 4 */                 return true;
                    }
/* 25 */            OoOil11Ol1o.I00111O();
/* 28 */            return false;
                }

                public final byte zza() throws zzagr {
/* 1 */             int i = this.zzj;
/* 5 */             if (i == this.zzh) {
/* 18 */                OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 21 */                return (byte) 0;
                    }
/* 7 */             byte[] bArr = this.zzg;
/* 11 */            this.zzj = i + 1;
/* 13 */            return bArr[i];
                }

                @Override
                public final double zzb() {
/* 5 */             return Double.longBitsToDouble(zzq());
                }

                @Override
                public final float zzc() {
/* 5 */             return Float.intBitsToFloat(zzi());
                }

                @Override
                public final int zzd() {
/* 1 */             return this.zzj;
                }

                @Override
                public final int zze(int i) throws zzagr {
/* 1 */             if (i < 0) {
/* 33 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 23 */                return 0;
                    }
/* 5 */             int i2 = i + this.zzj;
/* 6 */             if (i2 < 0) {
/* 27 */                OoOil11Ol1o.I001i1O0Ol("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 23 */                return 0;
                    }
/* 8 */             int i3 = this.zzl;
/* 10 */            if (i2 > i3) {
/* 20 */                OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 23 */                return 0;
                    }
/* 12 */            this.zzl = i2;
/* 14 */            zzO();
/* 17 */            return i3;
                }

                @Override
                public final int zzf() {
/* 1 */             return zzj();
                }

                @Override
                public final int zzg() {
/* 1 */             return zzi();
                }

                @Override
                public final int zzh() {
/* 1 */             return zzj();
                }

                public final int zzi() throws zzagr {
/* 1 */             int i = this.zzj;
/* 7 */             if (this.zzh - i < 4) {
/* 49 */                OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 52 */                return 0;
                    }
/* 9 */             byte[] bArr = this.zzg;
/* 13 */            this.zzj = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int zzj() {
                    int i;
/* 1 */             int i2 = this.zzj;
/* 3 */             int i3 = this.zzh;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.zzg;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzj = i4;
/* 19 */                    return b;
                        }
/* 23 */                if (i3 - i4 >= 9) {
/* 25 */                    int i5 = i2 + 2;
/* 31 */                    int i6 = (bArr[i4] << 7) ^ b;
/* 32 */                    if (i6 < 0) {
/* 34 */                        i = i6 ^ (-128);
                            } else {
/* 37 */                        int i7 = i2 + 3;
/* 43 */                        int i8 = (bArr[i5] << 14) ^ i6;
/* 44 */                        if (i8 >= 0) {
/* 46 */                            i = i8 ^ 16256;
                                } else {
/* 50 */                            int i9 = i2 + 4;
/* 56 */                            int i10 = i8 ^ (bArr[i7] << 21);
/* 57 */                            if (i10 < 0) {
/* 62 */                                i = (-2080896) ^ i10;
                                    } else {
/* 65 */                                i7 = i2 + 5;
/* 67 */                                byte b2 = bArr[i9];
/* 75 */                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
/* 76 */                                if (b2 < 0) {
/* 78 */                                    i9 = i2 + 6;
/* 82 */                                    if (bArr[i7] < 0) {
/* 84 */                                        i7 = i2 + 7;
/* 88 */                                        if (bArr[i9] < 0) {
/* 90 */                                            i9 = i2 + 8;
/* 94 */                                            if (bArr[i7] < 0) {
/* 96 */                                                i7 = i2 + 9;
/* 100 */                                               if (bArr[i9] < 0) {
/* 102 */                                                   int i12 = i2 + 10;
/* 106 */                                                   if (bArr[i7] >= 0) {
/* 110 */                                                       i5 = i12;
/* 111 */                                                       i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 115 */                                   i = i11;
                                        }
/* 113 */                               i = i11;
                                    }
/* 63 */                            i5 = i9;
                                }
/* 48 */                        i5 = i7;
                            }
/* 117 */                   this.zzj = i5;
/* 119 */                   return i;
                        }
                    }
/* 124 */           return (int) zzs();
                }

                @Override
                public final int zzk() {
/* 1 */             return zzi();
                }

                @Override
                public final int zzl() {
/* 5 */             return zzafh.zzF(zzj());
                }

                @Override
                public final int zzm() throws zzagr {
/* 5 */             if (zzC()) {
/* 8 */                 this.zzk = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iZzj = zzj();
/* 15 */            this.zzk = iZzj;
/* 19 */            if ((iZzj >>> 3) != 0) {
/* 21 */                return iZzj;
                    }
/* 24 */            OoOil11Ol1o.I001i1O0Ol("Protocol message contained an invalid tag (zero).");
/* 27 */            return 0;
                }

                @Override
                public final int zzn() {
/* 1 */             return zzj();
                }

                @Override
                public final long zzo() {
/* 1 */             return zzq();
                }

                @Override
                public final long zzp() {
/* 1 */             return zzr();
                }

                public final long zzq() throws zzagr {
/* 3 */             int i = this.zzj;
/* 10 */            if (this.zzh - i < 8) {
/* 105 */               OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 108 */               return 0L;
                    }
/* 12 */            byte[] bArr = this.zzg;
/* 16 */            this.zzj = i + 8;
/* 18 */            long j = bArr[i];
/* 33 */            long j2 = bArr[i + 2];
/* 38 */            long j3 = bArr[i + 3];
/* 101 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }

                public final long zzr() {
                    long j;
                    long j2;
                    long j3;
/* 1 */             int i = this.zzj;
/* 3 */             int i2 = this.zzh;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.zzg;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzj = i3;
/* 19 */                    return b;
                        }
/* 24 */                if (i2 - i3 >= 9) {
/* 26 */                    int i4 = i + 2;
/* 32 */                    int i5 = (bArr[i3] << 7) ^ b;
/* 33 */                    if (i5 < 0) {
/* 35 */                        j = i5 ^ (-128);
                            } else {
/* 40 */                        int i6 = i + 3;
/* 46 */                        int i7 = (bArr[i4] << 14) ^ i5;
/* 47 */                        if (i7 >= 0) {
/* 49 */                            j = i7 ^ 16256;
                                } else {
/* 55 */                            int i8 = i + 4;
/* 61 */                            int i9 = i7 ^ (bArr[i6] << 21);
/* 62 */                            if (i9 < 0) {
/* 67 */                                long j4 = (-2080896) ^ i9;
/* 70 */                                i4 = i8;
/* 71 */                                j = j4;
                                    } else {
/* 74 */                                i6 = i + 5;
/* 83 */                                long j5 = (bArr[i8] << 28) ^ i9;
/* 88 */                                if (j5 >= 0) {
/* 93 */                                    j = j5 ^ 266354560;
                                        } else {
/* 96 */                                    i4 = i + 6;
/* 104 */                                   long j6 = (bArr[i6] << 35) ^ j5;
/* 107 */                                   if (j6 < 0) {
/* 109 */                                       j3 = -34093383808L;
                                            } else {
/* 117 */                                       int i10 = i + 7;
/* 125 */                                       long j7 = j6 ^ (bArr[i4] << 42);
/* 128 */                                       if (j7 >= 0) {
/* 130 */                                           j2 = 4363953127296L;
                                                } else {
/* 139 */                                           i4 = i + 8;
/* 147 */                                           j6 = j7 ^ (bArr[i10] << 49);
/* 150 */                                           if (j6 < 0) {
/* 152 */                                               j3 = -558586000294016L;
                                                    } else {
/* 158 */                                               i10 = i + 9;
/* 166 */                                               j7 = j6 ^ (bArr[i4] << 56);
/* 169 */                                               if (j7 >= 0) {
/* 171 */                                                   j2 = 71499008037633920L;
                                                        } else {
/* 177 */                                                   i4 = i + 10;
/* 185 */                                                   long j8 = j7 ^ (bArr[i10] << 63);
/* 189 */                                                   if (j8 >= 0) {
/* 196 */                                                       j = j8 ^ (-9151873028817141888L);
                                                            }
                                                        }
                                                    }
                                                }
/* 135 */                                       j = j7 ^ j2;
/* 137 */                                       i4 = i10;
                                            }
/* 114 */                                   j = j6 ^ j3;
                                        }
                                    }
                                }
/* 52 */                        i4 = i6;
                            }
/* 197 */                   this.zzj = i4;
/* 199 */                   return j;
                        }
                    }
/* 200 */           return zzs();
                }

                public final long zzs() throws zzagr {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 16 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 19 */                if ((zza() & 128) == 0) {
/* 21 */                    return j;
                        }
                    }
/* 27 */            OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered a malformed varint.");
/* 30 */            return 0L;
                }

                @Override
                public final long zzt() {
/* 1 */             return zzq();
                }

                @Override
                public final long zzu() {
/* 5 */             return zzafh.zzH(zzr());
                }

                @Override
                public final long zzv() {
/* 1 */             return zzr();
                }

                @Override
                public final zzafd zzw() throws zzagr {
/* 1 */             int iZzj = zzj();
/* 6 */             if (iZzj > 0) {
/* 8 */                 int i = this.zzh;
/* 10 */                int i2 = this.zzj;
/* 13 */                if (iZzj <= i - i2) {
/* 17 */                    zzafd zzafdVarZzl = zzafd.zzl(this.zzg, i2, iZzj, false);
                            this.zzj += iZzj;
/* 26 */                    return zzafdVarZzl;
                        }
                    }
/* 27 */            if (iZzj == 0) {
/* 29 */                return zzafd.zza;
                    }
/* 32 */            if (iZzj > 0) {
/* 34 */                int i3 = this.zzh;
/* 36 */                int i4 = this.zzj;
/* 39 */                if (iZzj <= i3 - i4) {
/* 41 */                    int i5 = iZzj + i4;
/* 42 */                    this.zzj = i5;
/* 50 */                    return zzafd.zzm(Arrays.copyOfRange(this.zzg, i4, i5), false);
                        }
                    }
/* 55 */            if (iZzj <= 0) {
/* 59 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 62 */                return null;
                    }
/* 66 */            OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 69 */            return null;
                }

                @Override
                public final String zzx() throws zzagr {
/* 1 */             int iZzj = zzj();
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzh;
/* 9 */                 int i2 = this.zzj;
/* 12 */                if (iZzj <= i - i2) {
/* 21 */                    String str = new String(this.zzg, i2, iZzj, zzagp.zza);
                            this.zzj += iZzj;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iZzj == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iZzj < 0) {
/* 39 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 42 */                return null;
                    }
/* 46 */            OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */            return null;
                }

                @Override
                public final String zzy() throws zzagr {
/* 1 */             int iZzj = zzj();
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzh;
/* 9 */                 int i2 = this.zzj;
/* 12 */                if (iZzj <= i - i2) {
/* 17 */                    String strZzc = zzaiy.zzc(this.zzg, i2, iZzj);
                            this.zzj += iZzj;
/* 26 */                    return strZzc;
                        }
                    }
/* 27 */            if (iZzj == 0) {
/* 29 */                return "";
                    }
/* 32 */            if (iZzj <= 0) {
/* 36 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 39 */                return null;
                    }
/* 43 */            OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 39 */            return null;
                }

                @Override
                public final void zzz(int i) throws zzagr {
/* 3 */             if (this.zzk == i) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001i1O0Ol("Protocol message end-group tag did not match expected tag.");
                }
            }
