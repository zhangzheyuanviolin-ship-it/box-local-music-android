            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.List;
            import p000.I000II;
            import p000.IIlIOloOOO;
            import p000.OoOil11Ol1o;
            import p000.iilo0lOo110;
            
            final class zzaff extends zzafh {
                private final InputStream zzg;
                private final byte[] zzh;
                private int zzi;
                private int zzj;
                private int zzk;
                private int zzl;
                private int zzm;
                private int zzn;

                public zzaff(InputStream inputStream, int i, zzafg zzafgVar) {
/* 2 */             super(null);
/* 8 */             this.zzn = Integer.MAX_VALUE;
/* 10 */            byte[] bArr = zzagp.zzb;
/* 12 */            this.zzg = inputStream;
/* 18 */            this.zzh = new byte[Barcode.FORMAT_AZTEC];
/* 21 */            this.zzi = 0;
/* 23 */            this.zzk = 0;
/* 25 */            this.zzm = 0;
                }

                private final List zzO(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, Barcode.FORMAT_AZTEC);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
/* 23 */                    int i3 = this.zzg.read(bArr, i2, iMin - i2);
/* 28 */                    if (i3 == -1) {
/* 39 */                        OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */                        return null;
                            }
                            this.zzm += i3;
/* 35 */                    i2 += i3;
                        }
/* 44 */                i -= iMin;
/* 45 */                arrayList.add(bArr);
                    }
/* 77 */            return arrayList;
                }

                private final void zzP() {
/* 5 */             int i = this.zzi + this.zzj;
/* 6 */             this.zzi = i;
/* 10 */            int i2 = this.zzm + i;
/* 11 */            int i3 = this.zzn;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.zzj = 0;
/* 55 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.zzj = i4;
/* 19 */            this.zzi = i - i4;
                }

                private final void zzQ(int i) throws zzagr {
/* 5 */             if (zzR(i)) {
/* 29 */                return;
                    }
/* 15 */            if (i > (this.zzd - this.zzm) - this.zzk) {
/* 19 */                OoOil11Ol1o.I001i1O0Ol("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    } else {
/* 25 */                OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                private final boolean zzR(int i) throws IOException {
/* 1 */             int i2 = this.zzk;
/* 3 */             int i3 = i2 + i;
/* 5 */             int i4 = this.zzi;
/* 7 */             if (i3 <= i4) {
/* 127 */               I000II.I001IO000(IIlIOloOOO.I00100l0("refillBuffer() called when ", i, " bytes were already available in buffer"));
/* 112 */               return false;
                    }
/* 9 */             int i5 = this.zzd;
/* 11 */            int i6 = this.zzm;
/* 16 */            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.zzn) {
/* 15 */                return false;
                    }
/* 27 */            if (i2 > 0) {
/* 29 */                if (i4 > i2) {
/* 31 */                    byte[] bArr = this.zzh;
/* 34 */                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
/* 39 */                i6 = this.zzm + i2;
/* 41 */                this.zzm = i6;
/* 45 */                i4 = this.zzi - i2;
/* 47 */                this.zzi = i4;
/* 49 */                this.zzk = 0;
                    }
                    try {
/* 65 */                int i7 = this.zzg.read(this.zzh, i4, Math.min(4096 - i4, (this.zzd - i6) - i4));
/* 69 */                if (i7 == 0 || i7 < -1 || i7 > 4096) {
/* 109 */                   iilo0lOo110.I00000oOI(i7, this.zzg.getClass());
/* 112 */                   return false;
                        }
/* 78 */                if (i7 <= 0) {
/* 15 */                    return false;
                        }
                        this.zzi += i7;
/* 85 */                zzP();
                        return this.zzi >= i || zzR(i);
                    } catch (zzagr e) {
/* 115 */               e.zza();
/* 118 */               throw e;
                    }
                }

                private final byte[] zzS(int i, boolean z) throws IOException {
/* 1 */             byte[] bArrZzT = zzT(i);
/* 5 */             if (bArrZzT != null) {
/* 7 */                 return bArrZzT;
                    }
/* 8 */             int i2 = this.zzk;
/* 10 */            int i3 = this.zzi;
/* 12 */            int i4 = i3 - i2;
                    this.zzm += i3;
/* 20 */            this.zzk = 0;
/* 22 */            this.zzi = 0;
/* 26 */            List<byte[]> listZzO = zzO(i - i4);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.zzh, i2, bArr, 0, i4);
/* 45 */            for (byte[] bArr2 : listZzO) {
/* 53 */                int length = bArr2.length;
/* 54 */                System.arraycopy(bArr2, 0, bArr, i4, length);
/* 57 */                i4 += length;
                    }
/* 106 */           return bArr;
                }

                private final byte[] zzT(int i) throws IOException {
/* 1 */             if (i == 0) {
/* 3 */                 return zzagp.zzb;
                    }
/* 6 */             int i2 = this.zzm;
/* 8 */             int i3 = this.zzk;
/* 14 */            int i4 = i2 + i3 + i;
/* 17 */            if (i4 - this.zzd > 0) {
/* 111 */               OoOil11Ol1o.I001i1O0Ol("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 92 */                return null;
                    }
/* 19 */            int i5 = this.zzn;
/* 23 */            if (i4 > i5) {
/* 102 */               zzB((i5 - i2) - i3);
/* 105 */               OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 92 */                return null;
                    }
/* 27 */            int i6 = this.zzi - i3;
/* 28 */            int i7 = i - i6;
/* 32 */            if (i7 >= 4096) {
                        try {
/* 40 */                    if (i7 > this.zzg.available()) {
/* 43 */                        return null;
                            }
                        } catch (zzagr e) {
/* 46 */                    e.zza();
/* 49 */                    throw e;
                        }
                    }
/* 50 */            byte[] bArr = new byte[i];
/* 55 */            System.arraycopy(this.zzh, i3, bArr, 0, i6);
                    this.zzm += this.zzi;
/* 65 */            this.zzk = 0;
/* 67 */            this.zzi = 0;
/* 69 */            while (i6 < i) {
                        try {
/* 75 */                    int i8 = this.zzg.read(bArr, i6, i - i6);
/* 80 */                    if (i8 == -1) {
/* 89 */                        OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 92 */                        return null;
                            }
                            this.zzm += i8;
/* 87 */                    i6 += i8;
                        } catch (zzagr e2) {
/* 95 */                    e2.zza();
/* 98 */                    throw e2;
                        }
                    }
/* 99 */            return bArr;
                }

                @Override
                public final void zzA(int i) {
/* 1 */             this.zzn = i;
/* 3 */             zzP();
                }

                public final void zzB(int i) throws zzagr {
/* 1 */             int i2 = this.zzi;
/* 3 */             int i3 = this.zzk;
/* 5 */             int i4 = i2 - i3;
/* 6 */             if (i <= i4 && i >= 0) {
/* 12 */                this.zzk = i3 + i;
/* 14 */                return;
                    }
/* 15 */            if (i < 0) {
/* 169 */               OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 437 */               return;
                    }
/* 17 */            int i5 = this.zzm;
/* 19 */            int i6 = i5 + i3;
/* 21 */            int i7 = this.zzn;
/* 25 */            if (i6 + i > i7) {
/* 158 */               zzB((i7 - i5) - i3);
/* 163 */               OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 166 */               return;
                    }
/* 27 */            this.zzm = i6;
/* 30 */            this.zzi = 0;
/* 32 */            this.zzk = 0;
/* 34 */            while (i4 < i) {
                        try {
/* 38 */                    long j = i - i4;
                            try {
/* 41 */                        long jSkip = this.zzg.skip(j);
/* 49 */                        if (jSkip < 0 || jSkip > j) {
/* 101 */                           throw new IllegalStateException(String.valueOf(this.zzg.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 55 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 59 */                            i4 += (int) jSkip;
                                }
                            } catch (zzagr e) {
/* 105 */                       e.zza();
/* 108 */                       throw e;
                            }
                        } catch (Throwable th) {
                            this.zzm += i4;
/* 114 */                   zzP();
/* 117 */                   throw th;
                        }
                    }
                    this.zzm += i4;
/* 123 */           zzP();
/* 126 */           if (i4 >= i) {
/* 155 */               return;
                    }
/* 128 */           int i8 = this.zzi;
/* 132 */           int i9 = i8 - this.zzk;
/* 134 */           this.zzk = i8;
/* 137 */           zzQ(1);
                    while (true) {
/* 140 */               int i10 = i - i9;
/* 142 */               int i11 = this.zzi;
/* 144 */               if (i10 <= i11) {
/* 153 */                   this.zzk = i10;
/* 155 */                   return;
                        } else {
/* 146 */                   i9 += i11;
/* 147 */                   this.zzk = i11;
/* 149 */                   zzQ(1);
                        }
                    }
                }

                @Override
                public final boolean zzC() {
                    return this.zzk == this.zzi && !zzR(1);
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
/* 67 */                if (this.zzi - this.zzk < 10) {
/* 91 */                    while (i3 < 10) {
/* 97 */                        if (zza() < 0) {
/* 99 */                            i3++;
                                }
                            }
/* 103 */                   OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered a malformed varint.");
/* 28 */                    return false;
                        }
/* 69 */                while (i3 < 10) {
/* 71 */                    byte[] bArr = this.zzh;
/* 73 */                    int i4 = this.zzk;
/* 77 */                    this.zzk = i4 + 1;
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
/* 5 */             if (this.zzk == this.zzi) {
/* 8 */                 zzQ(1);
                    }
/* 11 */            byte[] bArr = this.zzh;
/* 13 */            int i = this.zzk;
/* 17 */            this.zzk = i + 1;
/* 19 */            return bArr[i];
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
/* 5 */             return this.zzm + this.zzk;
                }

                @Override
                public final int zze(int i) throws zzagr {
/* 1 */             if (i < 0) {
/* 36 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 26 */                return 0;
                    }
/* 8 */             int i2 = this.zzm + this.zzk + i;
/* 9 */             if (i2 < 0) {
/* 30 */                OoOil11Ol1o.I001i1O0Ol("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 26 */                return 0;
                    }
/* 11 */            int i3 = this.zzn;
/* 13 */            if (i2 > i3) {
/* 23 */                OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 26 */                return 0;
                    }
/* 15 */            this.zzn = i2;
/* 17 */            zzP();
/* 20 */            return i3;
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
/* 1 */             int i = this.zzk;
/* 7 */             if (this.zzi - i < 4) {
/* 9 */                 zzQ(4);
/* 12 */                i = this.zzk;
                    }
/* 14 */            byte[] bArr = this.zzh;
/* 18 */            this.zzk = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int zzj() {
                    int i;
/* 1 */             int i2 = this.zzk;
/* 3 */             int i3 = this.zzi;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.zzh;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzk = i4;
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
/* 117 */                   this.zzk = i5;
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
/* 8 */                 this.zzl = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iZzj = zzj();
/* 15 */            this.zzl = iZzj;
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
/* 3 */             int i = this.zzk;
/* 10 */            if (this.zzi - i < 8) {
/* 12 */                zzQ(8);
/* 15 */                i = this.zzk;
                    }
/* 17 */            byte[] bArr = this.zzh;
/* 21 */            this.zzk = i + 8;
/* 23 */            long j = bArr[i];
/* 38 */            long j2 = bArr[i + 2];
/* 43 */            long j3 = bArr[i + 3];
/* 106 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }

                public final long zzr() {
                    long j;
                    long j2;
                    long j3;
/* 1 */             int i = this.zzk;
/* 3 */             int i2 = this.zzi;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.zzh;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzk = i3;
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
/* 197 */                   this.zzk = i4;
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
                public final zzafd zzw() throws IOException {
/* 1 */             int iZzj = zzj();
/* 5 */             int i = this.zzi;
/* 7 */             int i2 = this.zzk;
/* 11 */            if (iZzj <= i - i2 && iZzj > 0) {
/* 17 */                zzafd zzafdVarZzl = zzafd.zzl(this.zzh, i2, iZzj, false);
                        this.zzk += iZzj;
/* 26 */                return zzafdVarZzl;
                    }
/* 27 */            if (iZzj == 0) {
/* 29 */                return zzafd.zza;
                    }
/* 32 */            if (iZzj < 0) {
/* 112 */               OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 115 */               return null;
                    }
/* 34 */            byte[] bArrZzT = zzT(iZzj);
/* 38 */            if (bArrZzT != null) {
/* 41 */                return zzafd.zzl(bArrZzT, 0, bArrZzT.length, false);
                    }
/* 46 */            int i3 = this.zzk;
/* 48 */            int i4 = this.zzi;
/* 50 */            int i5 = i4 - i3;
                    this.zzm += i4;
/* 57 */            this.zzk = 0;
/* 59 */            this.zzi = 0;
/* 63 */            List<byte[]> listZzO = zzO(iZzj - i5);
/* 67 */            byte[] bArr = new byte[iZzj];
/* 71 */            System.arraycopy(this.zzh, i3, bArr, 0, i5);
/* 82 */            for (byte[] bArr2 : listZzO) {
/* 90 */                int length = bArr2.length;
/* 91 */                System.arraycopy(bArr2, 0, bArr, i5, length);
/* 94 */                i5 += length;
                    }
                    try {
/* 96 */                return zzafd.zzm(bArr, false);
                    } catch (zzagr e) {
/* 109 */               throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                }

                @Override
                public final String zzx() throws zzagr {
/* 1 */             int iZzj = zzj();
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzi;
/* 9 */                 int i2 = this.zzk;
/* 12 */                if (iZzj <= i - i2) {
/* 21 */                    String str = new String(this.zzh, i2, iZzj, zzagp.zza);
                            this.zzk += iZzj;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iZzj == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iZzj < 0) {
/* 76 */                OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 79 */                return null;
                    }
/* 39 */            if (iZzj > this.zzi) {
/* 70 */                return new String(zzS(iZzj, false), zzagp.zza);
                    }
/* 41 */            zzQ(iZzj);
/* 52 */            String str2 = new String(this.zzh, this.zzk, iZzj, zzagp.zza);
                    this.zzk += iZzj;
/* 60 */            return str2;
                }

                @Override
                public final String zzy() throws IOException {
                    byte[] bArrZzS;
/* 1 */             int iZzj = zzj();
/* 5 */             int i = this.zzk;
/* 7 */             int i2 = this.zzi;
/* 11 */            if (iZzj <= i2 - i && iZzj > 0) {
/* 15 */                bArrZzS = this.zzh;
/* 19 */                this.zzk = i + iZzj;
                    } else {
/* 22 */                if (iZzj == 0) {
/* 24 */                    return "";
                        }
/* 27 */                if (iZzj < 0) {
/* 51 */                    OoOil11Ol1o.I001i1O0Ol("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 54 */                    return null;
                        }
/* 29 */                i = 0;
/* 30 */                if (iZzj <= i2) {
/* 32 */                    zzQ(iZzj);
/* 35 */                    bArrZzS = this.zzh;
/* 37 */                    this.zzk = iZzj;
                        } else {
/* 40 */                    bArrZzS = zzS(iZzj, false);
                        }
                    }
/* 44 */            return zzaiy.zzc(bArrZzS, i, iZzj);
                }

                @Override
                public final void zzz(int i) throws zzagr {
/* 3 */             if (this.zzl == i) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001i1O0Ol("Protocol message end-group tag did not match expected tag.");
                }
            }
