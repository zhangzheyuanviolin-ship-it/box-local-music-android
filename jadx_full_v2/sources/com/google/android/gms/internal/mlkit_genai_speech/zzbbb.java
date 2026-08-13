            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.InputStream;
            import java.util.ArrayList;
            import p000.OoOil11Ol1o;
            
            abstract class zzbbb implements zzbni {
                protected final zzbat zza;
                protected final zzatu zzb;
                final int zzc;
                protected zzbby zzd;
                protected zzbng zze;
                protected zzbnj zzf;
                private InputStream zzg;
                private int zzh;
                private int zzi;
                private ArrayList zzj;
                private boolean zzk;
                private int zzl;
                private int zzm;
                private zzbay zzn = zzbay.UNINITIALIZED;
                private int zzo;
                private int zzp;
                private boolean zzq;
                private boolean zzr;

                public zzbbb(zzbat zzbatVar, zzatu zzatuVar, int i, zzbba zzbbaVar) {
/* 8 */             this.zza = zzbatVar;
/* 10 */            this.zzb = zzatuVar;
/* 12 */            this.zzc = i;
                }

                private final void zzp(zzazd zzazdVar, zzazd zzazdVar2, boolean z) {
/* 5 */             if (zzo()) {
/* 98 */                return;
                    }
/* 15 */            boolean z2 = this.zzn != zzbay.UNINITIALIZED;
/* 18 */            zzl(zzbay.CLOSED);
/* 21 */            if (z2) {
/* 25 */                this.zze.zzm(zzazdVar2);
                    }
/* 28 */            if (!z) {
/* 34 */                this.zza.zzx(this.zzc, zzazdVar);
                    }
/* 37 */            if (z2) {
/* 39 */                zza(zzazdVar2);
                    }
/* 44 */            this.zza.zzs(this);
                }

                private final void zzq() {
                    zzbaz zzbazVar;
/* 3 */             if (this.zzi == 0) {
/* 5 */                 int i = 0;
/* 6 */                 int i2 = 0;
/* 13 */                while (i < this.zzj.size() && (zzbazVar = (zzbaz) this.zzj.get(i)) != null) {
/* 26 */                    i++;
/* 30 */                    i2 += zzbazVar.zzc;
/* 33 */                    if (zzbazVar.zzd) {
/* 35 */                        this.zzi = i;
/* 37 */                        zzr(i2);
/* 55 */                        return;
                            }
                        }
                    }
                }

                private final void zzr(int i) {
/* 1 */             zzbng zzbngVar = this.zze;
/* 3 */             zzbngVar.getClass();
/* 8 */             zzbngVar.zze(this.zzo);
                    long j = i;
/* 17 */            this.zze.zzf(this.zzo, j, j);
                    this.zzo++;
                }

                private final boolean zzs() {
                    return this.zzg != null || this.zzi > 0;
                }

                private final boolean zzt() {
                    return this.zzk && this.zzh >= this.zzl;
                }

                public final synchronized String toString() {
                    StringBuilder sb;
/* 6 */             String simpleName = getClass().getSimpleName();
/* 10 */            boolean z = this.zzk;
/* 14 */            String strValueOf = String.valueOf(this.zzn);
/* 18 */            boolean zZzs = zzs();
/* 22 */            zzbnj zzbnjVar = this.zzf;
/* 26 */            sb = new StringBuilder();
/* 29 */            sb.append(simpleName);
/* 34 */            sb.append("[SfxA=");
/* 37 */            sb.append(z);
/* 42 */            sb.append("/De=");
/* 45 */            sb.append(strValueOf);
/* 50 */            sb.append("/Msg=");
/* 53 */            sb.append(zZzs);
/* 58 */            sb.append("/Lis=");
/* 66 */            sb.append(zzbnjVar != null);
/* 71 */            sb.append("]");
/* 74 */            return sb.toString();
                }

                public abstract void zza(zzazd zzazdVar);

                public abstract void zzb();

                public abstract void zzc(int i, Parcel parcel);

                public abstract void zzd(int i, Parcel parcel);

                public boolean zze() {
/* 20 */            throw null;
                }

                @Override
                public final synchronized InputStream zzf() {
                    zzbau zzbauVar;
                    try {
/* 2 */                 InputStream inputStream = this.zzg;
/* 6 */                 if (inputStream != null) {
/* 8 */                     this.zzg = null;
                        } else if (this.zzp <= 0 || !zzs()) {
/* 87 */                    inputStream = null;
                        } else {
/* 24 */                    int i = this.zzi;
/* 26 */                    this.zzi = 0;
/* 29 */                    if (i == 1) {
/* 37 */                        zzbaz zzbazVar = (zzbaz) this.zzj.remove(0);
/* 39 */                        int i2 = zzbazVar.zzc;
/* 45 */                        zzbauVar = new zzbau(zzbazVar.zzb);
                            } else {
/* 49 */                        byte[][] bArr = new byte[i][];
/* 52 */                        int length = 0;
/* 53 */                        for (int i3 = 0; i3 < i; i3++) {
/* 63 */                            byte[] bArr2 = ((zzbaz) this.zzj.remove(0)).zzb;
/* 65 */                            bArr[i3] = bArr2;
/* 68 */                            length += bArr2.length;
                                }
/* 74 */                        zzbauVar = new zzbau(bArr, length);
                            }
                            this.zzh += i;
/* 82 */                    zzq();
/* 85 */                    inputStream = zzbauVar;
                        }
/* 88 */                if (inputStream != null) {
                            this.zzp--;
                        } else {
/* 97 */                    this.zzr = false;
/* 103 */                   if (zzt() && !zzo()) {
/* 113 */                       zzl(zzbay.ALL_MESSAGES_DELIVERED);
/* 116 */                       zzi();
/* 4 */                         return null;
                            }
                        }
/* 122 */               return inputStream;
                    } catch (Throwable th) {
/* 245 */               throw th;
                    }
                }

                public final void zzg(zzazd zzazdVar) {
/* 2 */             zzp(zzazdVar, zzazdVar, false);
                }

                public final void zzh(zzazd zzazdVar) {
/* 4 */             zzp(zzazd.zzb, zzazdVar, false);
                }

                /* JADX WARN: Code restructure failed: missing block: B:43:0x006e, code lost:
                
                    r4.zzq = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:
                
                    return;
                 */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0065 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x003f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzi() {
                    int iOrdinal;
/* 3 */             if (this.zzq) {
/* 5 */                 return;
                    }
/* 7 */             this.zzq = true;
                    while (true) {
/* 11 */                int iOrdinal2 = this.zzn.ordinal();
/* 17 */                if (iOrdinal2 != 2) {
/* 19 */                    if (iOrdinal2 != 3 || this.zzf == null || !this.zzk) {
                                break;
                            }
/* 58 */                    iOrdinal = this.zzn.ordinal();
/* 62 */                    if (iOrdinal != 2) {
/* 64 */                        if (iOrdinal != 3) {
/* 67 */                            OoOil11Ol1o.I0000Il00O();
/* 70 */                            return;
                                }
                            } else if (!this.zzr) {
/* 79 */                        if (zzs()) {
/* 81 */                            this.zzr = true;
/* 85 */                            this.zzf.zzf(this);
                                } else if (this.zzk) {
/* 95 */                            zzl(zzbay.ALL_MESSAGES_DELIVERED);
                                }
                            }
/* 100 */                   if (this.zzk) {
/* 104 */                       zzl(zzbay.SUFFIX_DELIVERED);
/* 107 */                       zzb();
                            }
                        } else {
/* 33 */                    if (this.zzf == null || this.zzr) {
                                break;
                            }
/* 43 */                    if (zzs()) {
/* 47 */                        if (this.zzp == 0) {
                                    break;
                                }
/* 58 */                        iOrdinal = this.zzn.ordinal();
/* 62 */                        if (iOrdinal != 2) {
                                }
/* 100 */                       if (this.zzk) {
                                }
                            } else {
/* 54 */                        if (!zzt()) {
                                    break;
                                }
/* 58 */                        iOrdinal = this.zzn.ordinal();
/* 62 */                        if (iOrdinal != 2) {
                                }
/* 100 */                       if (this.zzk) {
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: all -> 0x0020, zzaze -> 0x0023, TRY_ENTER, TryCatch #1 {zzaze -> 0x0023, blocks: (B:8:0x000a, B:10:0x0017, B:17:0x0026, B:19:0x003a, B:21:0x0044, B:23:0x0049, B:25:0x0053, B:26:0x0056, B:30:0x005d, B:32:0x0061, B:35:0x0067, B:37:0x006b, B:41:0x0072, B:42:0x0080, B:43:0x0089, B:46:0x009c, B:47:0x00a3, B:49:0x00a9, B:51:0x00b6, B:52:0x00bc, B:53:0x00c5, B:54:0x00dc, B:56:0x00df, B:57:0x00e6, B:59:0x00ea, B:61:0x00ee, B:64:0x00f6, B:65:0x00fe, B:68:0x010d, B:69:0x011b), top: B:78:0x000a, outer: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00a3 A[Catch: all -> 0x0020, zzaze -> 0x0023, TryCatch #1 {zzaze -> 0x0023, blocks: (B:8:0x000a, B:10:0x0017, B:17:0x0026, B:19:0x003a, B:21:0x0044, B:23:0x0049, B:25:0x0053, B:26:0x0056, B:30:0x005d, B:32:0x0061, B:35:0x0067, B:37:0x006b, B:41:0x0072, B:42:0x0080, B:43:0x0089, B:46:0x009c, B:47:0x00a3, B:49:0x00a9, B:51:0x00b6, B:52:0x00bc, B:53:0x00c5, B:54:0x00dc, B:56:0x00df, B:57:0x00e6, B:59:0x00ea, B:61:0x00ee, B:64:0x00f6, B:65:0x00fe, B:68:0x010d, B:69:0x011b), top: B:78:0x000a, outer: #0 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final synchronized void zzj(Parcel parcel) {
                    int i;
                    int size;
/* 6 */             if (zzo()) {
/* 9 */                 return;
                    }
                    try {
/* 11 */                int i2 = parcel.readInt();
/* 22 */                if (zzbcj.zzc(i2, 8)) {
/* 24 */                    zzazd zzazdVarZza = zzbcj.zza(i2, parcel);
/* 28 */                    zzp(zzazdVarZza, zzazdVarZza, true);
/* 32 */                    return;
                        }
/* 39 */                int i3 = parcel.readInt();
/* 43 */                boolean zZzc = zzbcj.zzc(i2, 1);
/* 48 */                boolean zZzc2 = zzbcj.zzc(i2, 2);
/* 53 */                boolean zZzc3 = zzbcj.zzc(i2, 4);
/* 57 */                if (zZzc) {
/* 59 */                    zzc(i2, parcel);
/* 64 */                    zzl(zzbay.PREFIX_DELIVERED);
                        }
/* 67 */                if (zZzc2) {
/* 72 */                    if ((i2 & 64) != 0) {
/* 221 */                       throw new zzaze(zzazd.zze.zze("Parcelable messages not allowed"), null);
                            }
/* 74 */                    int i4 = parcel.readInt();
/* 78 */                    byte[] bArrZzc = zzbav.zzc(i4);
/* 82 */                    if (i4 > 0) {
/* 84 */                        parcel.readByteArray(bArrZzc);
                            }
/* 87 */                    int i5 = i2 & Barcode.FORMAT_ITF;
/* 93 */                    boolean z = i5 == 0;
/* 96 */                    if (this.zzj != null) {
/* 140 */                       zzbaz zzbazVar = new zzbaz(null, bArrZzc, i4, z);
/* 145 */                       i = i3 - this.zzh;
/* 149 */                       size = this.zzj.size();
/* 153 */                       ArrayList arrayList = this.zzj;
/* 155 */                       if (i >= size) {
/* 157 */                           arrayList.set(i, zzbazVar);
/* 160 */                           zzq();
                                } else if (i > arrayList.size()) {
/* 181 */                           do {
/* 172 */                               this.zzj.add(null);
/* 181 */                           } while (i > this.zzj.size());
/* 185 */                           this.zzj.add(zzbazVar);
                                } else {
/* 191 */                           this.zzj.add(zzbazVar);
/* 194 */                           zzq();
                                }
                            } else if (this.zzo == 0 && i5 == 0 && i3 == this.zzh) {
/* 115 */                       zzgo.zzm(this.zzg == null);
/* 123 */                       this.zzg = new zzbau(bArrZzc);
/* 125 */                       zzr(i4);
                            } else {
/* 136 */                       this.zzj = new ArrayList(16);
/* 140 */                       zzbaz zzbazVar2 = new zzbaz(null, bArrZzc, i4, z);
/* 145 */                       i = i3 - this.zzh;
/* 149 */                       size = this.zzj.size();
/* 153 */                       ArrayList arrayList2 = this.zzj;
/* 155 */                       if (i >= size) {
                                }
                            }
                        }
/* 222 */               if (zZzc3) {
/* 224 */                   zzd(i2, parcel);
/* 227 */                   this.zzl = i3;
/* 229 */                   this.zzk = true;
                        }
/* 231 */               int i6 = this.zzh;
/* 233 */               if (i3 == i6) {
/* 235 */                   ArrayList arrayList3 = this.zzj;
/* 237 */                   if (arrayList3 == null) {
/* 240 */                       this.zzh = i6 + 1;
                            } else if (!zZzc2 && !zZzc3) {
/* 247 */                       arrayList3.remove(0);
                                this.zzh++;
                            }
                        }
/* 261 */               int iDataSize = this.zzm + parcel.dataSize();
/* 262 */               this.zzm = iDataSize;
/* 264 */               zzbng zzbngVar = this.zze;
/* 266 */               if (zzbngVar != null && iDataSize != 0) {
/* 271 */                   zzbngVar.zzh(iDataSize);
/* 279 */                   this.zze.zzg(this.zzm);
/* 282 */                   this.zzm = 0;
                        }
/* 284 */               zzi();
                    } catch (zzaze e) {
/* 289 */               zzazd zzazdVarZza2 = e.zza();
/* 293 */               zzp(zzazdVarZza2, zzazdVarZza2, false);
                    }
                }

                public final void zzk(zzbby zzbbyVar, zzbnj zzbnjVar) {
/* 1 */             this.zzd = zzbbyVar;
/* 7 */             this.zze = zzbbyVar.zzc();
/* 9 */             this.zzf = zzbnjVar;
/* 15 */            if (zzo()) {
/* 37 */                return;
                    }
/* 19 */            zzl(zzbay.INITIALIZED);
                }

                public final void zzl(zzbay zzbayVar) {
/* 1 */             zzbay zzbayVar2 = this.zzn;
/* 3 */             int iOrdinal = zzbayVar.ordinal();
/* 11 */            if (iOrdinal == 1) {
/* 66 */                zzgo.zzp(zzbayVar2 == zzbay.UNINITIALIZED, "%s -> %s", zzbayVar2, zzbayVar);
                    } else if (iOrdinal == 2) {
/* 57 */                zzgo.zzp(zzbayVar2 == zzbay.INITIALIZED || zzbayVar2 == zzbay.UNINITIALIZED, "%s -> %s", zzbayVar2, zzbayVar);
                    } else if (iOrdinal == 3) {
/* 44 */                zzgo.zzp(zzbayVar2 == zzbay.PREFIX_DELIVERED, "%s -> %s", zzbayVar2, zzbayVar);
                    } else if (iOrdinal == 4) {
/* 35 */                zzgo.zzp(zzbayVar2 == zzbay.ALL_MESSAGES_DELIVERED, "%s -> %s", zzbayVar2, zzbayVar);
                    } else if (iOrdinal != 5) {
/* 26 */                OoOil11Ol1o.I0000Il00O();
/* 29 */                return;
                    }
/* 69 */            this.zzn = zzbayVar;
                }

                public final void zzm() {
                    zzbby zzbbyVar;
                    zzbnj zzbnjVar;
                    synchronized (this) {
/* 2 */                 zzbbyVar = this.zzd;
/* 4 */                 zzbnjVar = this.zzf;
                    }
/* 7 */             if (zzbnjVar != null) {
/* 9 */                 zzbnjVar.zzg();
                    }
/* 12 */            if (zzbbyVar != null) {
                        try {
                            synchronized (zzbbyVar) {
/* 15 */                        zzbbyVar.zzg();
                            }
                        } catch (zzaze e) {
                            synchronized (this) {
/* 25 */                        zzazd zzazdVarZza = e.zza();
/* 30 */                        zzp(zzazdVarZza, zzazdVarZza, false);
                            }
                        }
                    }
                }

                public final void zzn(int i) {
                    this.zzp += i;
/* 6 */             zzi();
                }

                public final boolean zzo() {
                    return this.zzn == zzbay.CLOSED;
                }
            }
