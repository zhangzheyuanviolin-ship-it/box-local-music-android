            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Queue;
            import java.util.concurrent.ConcurrentLinkedQueue;
            
            abstract class zzbby {
                private final zzbat zza;
                private final int zzb;
                private final zzbng zzc;
                private boolean zzd;
                private InputStream zze;
                private Queue zzf;
                private boolean zzg;
                private int zzh;
                private int zzi;
                private int zzj;
                private int zzk = 1;

                public zzbby(zzbat zzbatVar, int i, zzbng zzbngVar, zzbbx zzbbxVar) {
/* 7 */             this.zza = zzbatVar;
/* 9 */             this.zzb = i;
/* 11 */            this.zzc = zzbngVar;
                }

                private final void zzb(int i) {
/* 1 */             int i2 = this.zzk;
                    int i3 = i - 1;
/* 7 */             if (i3 == 1) {
/* 33 */                zzgo.zzm(i2 == 1);
                    } else if (i3 == 2) {
/* 26 */                zzgo.zzm(i2 == 2);
                    } else if (i3 == 3) {
/* 19 */                zzgo.zzm(i2 == 3);
                    }
/* 36 */            this.zzk = i;
                }

                public final synchronized String toString() {
                    String simpleName;
                    int i;
                    try {
/* 6 */                 simpleName = getClass().getSimpleName();
/* 10 */                i = this.zzk;
                    } catch (Throwable th) {
/* 110 */               throw th;
                    }
/* 77 */            return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.zzi + "]";
                }

                public abstract int zza(Parcel parcel);

                public final zzbng zzc() {
/* 1 */             return this.zzc;
                }

                public final void zzd(InputStream inputStream) {
/* 2 */             this.zzd = true;
/* 4 */             Queue queue = this.zzf;
/* 6 */             if (queue != null) {
/* 8 */                 queue.add(inputStream);
                    } else {
/* 14 */                if (this.zze == null) {
/* 16 */                    this.zze = inputStream;
/* 18 */                    return;
                        }
/* 21 */                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
/* 24 */                this.zzf = concurrentLinkedQueue;
/* 26 */                concurrentLinkedQueue.add(inputStream);
                    }
                }

                public final void zze() {
/* 2 */             this.zzd = true;
                }

                public final void zzf() {
/* 2 */             this.zzg = true;
                }

                public final void zzg() throws zzaze {
                    int iZza;
                    InputStream inputStream;
                    int i;
                    while (true) {
/* 1 */                 int i2 = this.zzk;
                        int i3 = i2 - 1;
/* 6 */                 if (i2 == 0) {
/* 743 */                   throw null;
                        }
/* 9 */                 boolean z = true;
/* 10 */                if (i3 != 0) {
/* 12 */                    if (i3 != 1) {
/* 14 */                        if (i3 != 2 || !this.zzg) {
/* 345 */                           return;
                                }
                            } else if (!zzi() && !this.zzg) {
/* 345 */                       return;
                            }
                        } else if (!this.zzd) {
/* 345 */                   return;
                        }
/* 40 */                zzbat zzbatVar = this.zza;
/* 46 */                if (!zzbatVar.zzD()) {
/* 345 */                   return;
                        }
                        try {
                            try {
/* 48 */                        zzbbz zzbbzVarZzc = zzbbz.zzc();
                                try {
/* 56 */                            int i4 = 0;
/* 57 */                            zzbbzVarZzc.zza().writeInt(0);
/* 60 */                            Parcel parcelZza = zzbbzVarZzc.zza();
/* 64 */                            int i5 = this.zzh;
/* 68 */                            this.zzh = i5 + 1;
/* 70 */                            parcelZza.writeInt(i5);
/* 73 */                            int i6 = this.zzk;
                                    int i7 = i6 - 1;
/* 77 */                            if (i6 == 0) {
/* 318 */                               throw null;
                                    }
/* 79 */                            if (i7 == 0) {
/* 107 */                               iZza = zza(zzbbzVarZzc.zza()) | 1;
/* 108 */                               zzb(2);
/* 115 */                               if (zzi() || this.zzg) {
                                        }
/* 284 */                               zzbcj.zzb(zzbbzVarZzc.zza(), iZza);
/* 291 */                               int iDataSize = zzbbzVarZzc.zza().dataSize();
/* 297 */                               zzbatVar.zzz(this.zzb, zzbbzVarZzc);
/* 300 */                               zzbng zzbngVar = this.zzc;
                                        long j = iDataSize;
/* 303 */                               zzbngVar.zzl(j);
/* 306 */                               zzbngVar.zzk(j);
/* 309 */                               zzbbzVarZzc.close();
                                    } else if (i7 == 1) {
/* 97 */                                iZza = 0;
                                    } else {
/* 83 */                                if (i7 != 2) {
/* 92 */                                    throw new AssertionError();
                                        }
/* 269 */                               zzbbzVarZzc.zza();
/* 273 */                               iZza = i4 | 4;
/* 275 */                               zzb(4);
/* 284 */                               zzbcj.zzb(zzbbzVarZzc.zza(), iZza);
/* 291 */                               int iDataSize2 = zzbbzVarZzc.zza().dataSize();
/* 297 */                               zzbatVar.zzz(this.zzb, zzbbzVarZzc);
/* 300 */                               zzbng zzbngVar2 = this.zzc;
                                        long j2 = iDataSize2;
/* 303 */                               zzbngVar2.zzl(j2);
/* 306 */                               zzbngVar2.zzk(j2);
/* 309 */                               zzbbzVarZzc.close();
                                    }
/* 125 */                           if (this.zzi == 0) {
/* 127 */                               inputStream = this.zze;
                                    } else {
/* 130 */                               Queue queue = this.zzf;
/* 141 */                               inputStream = queue != null ? (InputStream) queue.peek() : null;
                                    }
/* 142 */                           if (inputStream != null) {
/* 144 */                               int i8 = iZza | 2;
/* 146 */                               Parcel parcelZza2 = zzbbzVarZzc.zza();
/* 152 */                               if (inputStream instanceof zzbca) {
/* 161 */                                   this.zzj = ((zzbca) inputStream).zza(parcelZza2);
/* 165 */                                   i = 64;
/* 166 */                                   z = false;
                                        } else {
/* 168 */                                   byte[] bArrZzb = zzbav.zzb();
                                            try {
/* 172 */                                       int i9 = inputStream.read(bArrZzb);
/* 176 */                                       if (i9 <= 0) {
/* 178 */                                           parcelZza2.writeInt(0);
                                                } else {
/* 186 */                                           parcelZza2.writeInt(i9);
/* 189 */                                           parcelZza2.writeByteArray(bArrZzb, 0, i9);
                                                    this.zzj += i9;
/* 198 */                                           if (i9 == bArrZzb.length) {
/* 200 */                                               i = Barcode.FORMAT_ITF;
                                                    }
                                                }
/* 181 */                                       z = false;
/* 182 */                                       i = 0;
                                            } finally {
/* 245 */                                       zzbav.zza(bArrZzb);
                                            }
                                        }
/* 205 */                               if (!z) {
/* 207 */                                   inputStream.close();
/* 210 */                                   int i10 = this.zzi;
/* 214 */                                   this.zzi = i10 + 1;
/* 216 */                                   if (i10 > 0) {
/* 218 */                                       Queue queue2 = this.zzf;
/* 220 */                                       if (queue2 == null) {
/* 226 */                                           throw null;
                                                }
/* 222 */                                       queue2.poll();
                                            }
/* 227 */                                   zzbng zzbngVar3 = this.zzc;
/* 229 */                                   zzbngVar3.zzi(i10);
/* 232 */                                   long j3 = this.zzj;
/* 236 */                                   zzbngVar3.zzj(i10, j3, j3);
/* 239 */                                   this.zzj = 0;
                                        }
/* 241 */                               i4 = i8 | i;
                                    } else {
/* 251 */                               zzgo.zzm(this.zzg);
/* 254 */                               i4 = iZza;
                                    }
/* 257 */                           if (!this.zzg || zzi()) {
/* 279 */                               iZza = i4;
/* 284 */                               zzbcj.zzb(zzbbzVarZzc.zza(), iZza);
/* 291 */                               int iDataSize22 = zzbbzVarZzc.zza().dataSize();
/* 297 */                               zzbatVar.zzz(this.zzb, zzbbzVarZzc);
/* 300 */                               zzbng zzbngVar22 = this.zzc;
                                        long j22 = iDataSize22;
/* 303 */                               zzbngVar22.zzl(j22);
/* 306 */                               zzbngVar22.zzk(j22);
/* 309 */                               zzbbzVarZzc.close();
                                    } else {
/* 266 */                               zzb(3);
/* 269 */                               zzbbzVarZzc.zza();
/* 273 */                               iZza = i4 | 4;
/* 275 */                               zzb(4);
/* 284 */                               zzbcj.zzb(zzbbzVarZzc.zza(), iZza);
/* 291 */                               int iDataSize222 = zzbbzVarZzc.zza().dataSize();
/* 297 */                               zzbatVar.zzz(this.zzb, zzbbzVarZzc);
/* 300 */                               zzbng zzbngVar222 = this.zzc;
                                        long j222 = iDataSize222;
/* 303 */                               zzbngVar222.zzl(j222);
/* 306 */                               zzbngVar222.zzk(j222);
/* 309 */                               zzbbzVarZzc.close();
                                    }
                                } catch (Throwable th) {
                                    try {
/* 319 */                               zzbbzVarZzc.close();
/* 327 */                               throw th;
                                    } catch (Throwable th2) {
/* 324 */                               th.addSuppressed(th2);
/* 327 */                               throw th;
                                    }
                                }
                            } catch (zzaze e) {
/* 341 */                       zzb(5);
/* 344 */                       throw e;
                            }
                        } catch (IOException e2) {
/* 339 */                   throw new zzaze(zzazd.zzi.zzd(e2), null);
                        }
                    }
                }

                public final boolean zzh() {
/* 3 */             return this.zza.zzD();
                }

                public final boolean zzi() {
/* 1 */             Queue queue = this.zzf;
                    return queue != null ? !queue.isEmpty() : this.zze != null && this.zzi == 0;
                }
            }
