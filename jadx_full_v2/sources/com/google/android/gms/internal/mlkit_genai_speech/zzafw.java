            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import p000.I000II;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 16 */    final class zzafw {
                private static final zzafw zzd = new zzafw(true);
                final zzaii zza = new zzaid();
                boolean zzb;
                boolean zzc;

                private zzafw(boolean z) {
/* 11 */            zzh();
/* 14 */            zzh();
                }

                public static int zza(zzaiz zzaizVar, int i, Object obj) {
                    int iZzb;
                    int iZzy;
/* 3 */             int iZzy2 = zzafm.zzy(i << 3);
/* 9 */             if (zzaizVar == zzaiz.zzj) {
/* 11 */                iZzy2 += iZzy2;
                    }
/* 12 */            zzaja zzajaVar = zzaja.INT;
/* 18 */            int iZzz = 4;
                    switch (zzaizVar.ordinal()) {
                        case 0:
/* 267 */                   ((Double) obj).getClass();
/* 72 */                    iZzz = 8;
/* 272 */                   return iZzy2 + iZzz;
                        case 1:
/* 261 */                   ((Float) obj).getClass();
/* 272 */                   return iZzy2 + iZzz;
                        case 2:
/* 254 */                   iZzz = zzafm.zzz(((Long) obj).longValue());
/* 272 */                   return iZzy2 + iZzz;
                        case 3:
/* 243 */                   iZzz = zzafm.zzz(((Long) obj).longValue());
/* 272 */                   return iZzy2 + iZzz;
                        case 4:
/* 232 */                   iZzz = zzafm.zzz(((Integer) obj).intValue());
/* 272 */                   return iZzy2 + iZzz;
                        case 5:
/* 220 */                   ((Long) obj).getClass();
/* 72 */                    iZzz = 8;
/* 272 */                   return iZzy2 + iZzz;
                        case 6:
/* 214 */                   ((Integer) obj).getClass();
/* 272 */                   return iZzy2 + iZzz;
                        case 7:
/* 207 */                   ((Boolean) obj).getClass();
/* 210 */                   iZzz = 1;
/* 272 */                   return iZzy2 + iZzz;
                        case 8:
/* 181 */                   if (obj instanceof zzafd) {
/* 185 */                       iZzb = ((zzafd) obj).zze();
/* 189 */                       iZzy = zzafm.zzy(iZzb);
                            } else {
/* 196 */                       iZzb = zzaiy.zzb((String) obj);
/* 200 */                       iZzy = zzafm.zzy(iZzb);
                            }
/* 138 */                   iZzz = iZzy + iZzb;
/* 272 */                   return iZzy2 + iZzz;
                        case 9:
/* 174 */                   iZzz = ((zzahn) obj).zzn();
/* 272 */                   return iZzy2 + iZzz;
                        case 10:
/* 152 */                   if (!(obj instanceof zzagw)) {
/* 167 */                       iZzz = zzafm.zzx((zzahn) obj);
/* 272 */                       return iZzy2 + iZzz;
                            }
/* 156 */                   iZzb = ((zzagw) obj).zza();
/* 160 */                   iZzy = zzafm.zzy(iZzb);
/* 138 */                   iZzz = iZzy + iZzb;
/* 272 */                   return iZzy2 + iZzz;
                        case 11:
/* 126 */                   if (obj instanceof zzafd) {
/* 130 */                       iZzb = ((zzafd) obj).zze();
/* 134 */                       iZzy = zzafm.zzy(iZzb);
                            } else {
/* 144 */                       iZzb = ((byte[]) obj).length;
/* 145 */                       iZzy = zzafm.zzy(iZzb);
                            }
/* 138 */                   iZzz = iZzy + iZzb;
/* 272 */                   return iZzy2 + iZzz;
                        case 12:
/* 118 */                   iZzz = zzafm.zzy(((Integer) obj).intValue());
/* 272 */                   return iZzy2 + iZzz;
                        case 13:
/* 106 */                   iZzz = obj instanceof zzagi ? zzafm.zzz(((zzagi) obj).zza()) : zzafm.zzz(((Integer) obj).intValue());
/* 272 */                   return iZzy2 + iZzz;
                        case 14:
/* 77 */                    ((Integer) obj).getClass();
/* 272 */                   return iZzy2 + iZzz;
                        case 15:
/* 69 */                    ((Long) obj).getClass();
/* 72 */                    iZzz = 8;
/* 272 */                   return iZzy2 + iZzz;
                        case 16:
/* 52 */                    int iIntValue = ((Integer) obj).intValue();
/* 61 */                    iZzz = zzafm.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 272 */                   return iZzy2 + iZzz;
                        case 17:
/* 34 */                    long jLongValue = ((Long) obj).longValue();
/* 44 */                    iZzz = zzafm.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 272 */                   return iZzy2 + iZzz;
                        default:
/* 31 */                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                }

                public static int zzb(zzafv zzafvVar, Object obj) {
/* 1 */             zzaiz zzaizVarZzb = zzafvVar.zzb();
/* 5 */             int iZza = zzafvVar.zza();
/* 9 */             zzafvVar.zzg();
/* 12 */            return zza(zzaizVarZzb, iZza, obj);
                }

                public static zzafw zze() {
/* 1 */             return zzd;
                }

                public static void zzk(zzafm zzafmVar, zzaiz zzaizVar, int i, Object obj) {
/* 3 */             if (zzaizVar == zzaiz.zzj) {
/* 244 */               zzafmVar.zzs(i, 3);
/* 247 */               ((zzahn) obj).zzJ(zzafmVar);
/* 251 */               zzafmVar.zzs(i, 4);
/* 254 */               return;
                    }
/* 9 */             zzafmVar.zzs(i, zzaizVar.zza());
/* 12 */            zzaja zzajaVar = zzaja.INT;
                    switch (zzaizVar.ordinal()) {
                        case 0:
/* 237 */                   zzafmVar.zzk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 223 */                   zzafmVar.zzi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 209 */                   zzafmVar.zzw(((Long) obj).longValue());
                            break;
                        case 3:
/* 199 */                   zzafmVar.zzw(((Long) obj).longValue());
                            break;
                        case 4:
/* 189 */                   zzafmVar.zzm(((Integer) obj).intValue());
                            break;
                        case 5:
/* 179 */                   zzafmVar.zzk(((Long) obj).longValue());
                            break;
                        case 6:
/* 169 */                   zzafmVar.zzi(((Integer) obj).intValue());
                            break;
                        case 7:
/* 159 */                   zzafmVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 139 */                   if (!(obj instanceof zzafd)) {
/* 149 */                       zzafmVar.zzr((String) obj);
                                break;
                            } else {
/* 143 */                       zzafmVar.zzg((zzafd) obj);
                                break;
                            }
                        case 9:
/* 133 */                   ((zzahn) obj).zzJ(zzafmVar);
                            break;
                        case 10:
/* 127 */                   zzafmVar.zzn((zzahn) obj);
                            break;
                        case 11:
/* 109 */                   if (!(obj instanceof zzafd)) {
/* 117 */                       byte[] bArr = (byte[]) obj;
/* 121 */                       zzafmVar.zze(bArr, 0, bArr.length);
                                break;
                            } else {
/* 113 */                       zzafmVar.zzg((zzafd) obj);
                                break;
                            }
                        case 12:
/* 103 */                   zzafmVar.zzu(((Integer) obj).intValue());
                            break;
                        case 13:
/* 75 */                    if (!(obj instanceof zzagi)) {
/* 93 */                        zzafmVar.zzm(((Integer) obj).intValue());
                                break;
                            } else {
/* 83 */                        zzafmVar.zzm(((zzagi) obj).zza());
                                break;
                            }
                        case 14:
/* 69 */                    zzafmVar.zzi(((Integer) obj).intValue());
                            break;
                        case 15:
/* 59 */                    zzafmVar.zzk(((Long) obj).longValue());
                            break;
                        case 16:
/* 40 */                    int iIntValue = ((Integer) obj).intValue();
/* 49 */                    zzafmVar.zzu((iIntValue >> 31) ^ (iIntValue + iIntValue));
                            break;
                        case 17:
/* 24 */                    long jLongValue = ((Long) obj).longValue();
/* 34 */                    zzafmVar.zzw((jLongValue >> 63) ^ (jLongValue + jLongValue));
                            break;
                    }
                }

                private static Object zzm(Object obj) {
/* 3 */             if (obj instanceof zzahs) {
/* 7 */                 return ((zzahs) obj).zzc();
                    }
/* 14 */            if (!(obj instanceof byte[])) {
/* 29 */                return obj;
                    }
/* 16 */            byte[] bArr = (byte[]) obj;
/* 18 */            int length = bArr.length;
/* 19 */            byte[] bArr2 = new byte[length];
/* 22 */            System.arraycopy(bArr, 0, bArr2, 0, length);
/* 25 */            return bArr2;
                }

                private final void zzn(Map.Entry entry) {
/* 5 */             zzafv zzafvVar = (zzafv) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 11 */            boolean z = value instanceof zzagw;
/* 13 */            zzafvVar.zzg();
/* 22 */            if (zzafvVar.zzc() != zzaja.MESSAGE) {
/* 84 */                if (z) {
/* 98 */                    I000II.I001IO000("Lazy fields must be message-valued");
/* 168 */                   return;
                        } else {
/* 92 */                    this.zza.put(zzafvVar, zzm(value));
/* 95 */                    return;
                        }
                    }
/* 24 */            Object objZzf = zzf(zzafvVar);
/* 28 */            if (objZzf == null) {
/* 36 */                this.zza.put(zzafvVar, zzm(value));
/* 39 */                if (z) {
/* 42 */                    this.zzc = true;
/* 44 */                    return;
                        }
/* 44 */                return;
                    }
/* 45 */            if (z) {
/* 47 */                zzagw zzagwVar = (zzagw) value;
/* 50 */                zzagwVar.zzd(null);
/* 53 */                value = zzagwVar.zza;
                    }
/* 59 */            if (!zzafvVar.zze(objZzf)) {
/* 80 */                zzafvVar.zzd(objZzf, value);
/* 83 */                return;
                    }
/* 63 */            zzahm zzahmVarZzI = ((zzahn) objZzf).zzI();
/* 67 */            zzafvVar.zzd(zzahmVarZzI, value);
/* 76 */            this.zza.put(zzafvVar, zzahmVarZzI.zzn());
                }

                private static boolean zzo(Map.Entry entry) {
/* 5 */             zzafv zzafvVar = (zzafv) entry.getKey();
/* 14 */            if (zzafvVar.zzc() != zzaja.MESSAGE) {
/* 13 */                return true;
                    }
/* 16 */            zzafvVar.zzg();
/* 19 */            Object value = entry.getValue();
/* 25 */            if (value instanceof zzaho) {
/* 29 */                return ((zzaho) value).zzs();
                    }
/* 36 */            if (value instanceof zzagw) {
/* 13 */                return true;
                    }
/* 41 */            I000II.I000iOII("Wrong object type used with protocol message reflection.");
/* 44 */            return false;
                }

                private static final int zzp(Map.Entry entry) {
                    int i;
                    int iZzy;
                    int iZzx;
/* 5 */             zzafv zzafvVar = (zzafv) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 17 */            if (zzafvVar.zzc() != zzaja.MESSAGE) {
/* 112 */               return zzb(zzafvVar, value);
                    }
/* 19 */            zzafvVar.zzg();
/* 22 */            zzafvVar.zzf();
/* 33 */            if (value instanceof zzagw) {
/* 43 */                int iZza = ((zzafv) entry.getKey()).zza();
/* 47 */                int iZzy2 = zzafm.zzy(8);
/* 51 */                i = iZzy2 + iZzy2;
/* 60 */                iZzy = zzafm.zzy(iZza) + zzafm.zzy(16);
/* 61 */                int iZzy3 = zzafm.zzy(24);
/* 65 */                int iZza2 = ((zzagw) value).zza();
/* 69 */                iZzx = OooioIOo1.I001l0I00(iZza2, iZza2, iZzy3);
                    } else {
/* 82 */                int iZza3 = ((zzafv) entry.getKey()).zza();
/* 88 */                int iZzy4 = zzafm.zzy(8);
/* 92 */                i = iZzy4 + iZzy4;
/* 101 */               iZzy = zzafm.zzy(iZza3) + zzafm.zzy(16);
/* 110 */               iZzx = zzafm.zzx((zzahn) value) + zzafm.zzy(24);
                    }
/* 74 */            return i + iZzy + iZzx;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzafw) {
/* 17 */                return this.zza.equals(((zzafw) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final int zzc() {
/* 1 */             zzaii zzaiiVar = this.zza;
/* 3 */             int iZzc = zzaiiVar.zzc();
/* 8 */             int iZzp = 0;
/* 9 */             for (int i = 0; i < iZzc; i++) {
/* 19 */                iZzp += zzp(zzaiiVar.zzg(i));
                    }
/* 27 */            Iterator it = zzaiiVar.zzd().iterator();
/* 35 */            while (it.hasNext()) {
/* 47 */                iZzp += zzp((Map.Entry) it.next());
                    }
/* 55 */            return iZzp;
                }

                public final zzafw clone() {
/* 3 */             zzafw zzafwVar = new zzafw();
/* 6 */             zzaii zzaiiVar = this.zza;
/* 8 */             int iZzc = zzaiiVar.zzc();
/* 13 */            for (int i = 0; i < iZzc; i++) {
/* 15 */                Map.Entry entryZzg = zzaiiVar.zzg(i);
/* 32 */                zzafwVar.zzj((zzafv) ((zzaie) entryZzg).zza(), entryZzg.getValue());
                    }
/* 50 */            for (Map.Entry entry : zzaiiVar.zzd()) {
/* 68 */                zzafwVar.zzj((zzafv) entry.getKey(), entry.getValue());
                    }
/* 74 */            zzafwVar.zzc = this.zzc;
/* 110 */           return zzafwVar;
                }

                public final Object zzf(zzafv zzafvVar) {
/* 3 */             Object obj = this.zza.get(zzafvVar);
/* 9 */             if (!(obj instanceof zzagw)) {
/* 29 */                return obj;
                    }
/* 11 */            zzagw zzagwVar = (zzagw) obj;
/* 14 */            zzagwVar.zzd(null);
/* 17 */            return zzagwVar.zza;
                }

                public final Iterator zzg() {
/* 1 */             zzaii zzaiiVar = this.zza;
                    return zzaiiVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzagu(zzaiiVar.entrySet().iterator()) : zzaiiVar.entrySet().iterator();
                }

                public final void zzh() {
/* 3 */             if (this.zzb) {
/* 5 */                 return;
                    }
/* 6 */             zzaii zzaiiVar = this.zza;
/* 8 */             int iZzc = zzaiiVar.zzc();
/* 13 */            for (int i = 0; i < iZzc; i++) {
/* 19 */                Object value = zzaiiVar.zzg(i).getValue();
/* 25 */                if (value instanceof zzagg) {
/* 29 */                    ((zzagg) value).zzB();
                        }
                    }
/* 39 */            Iterator it = zzaiiVar.zzd().iterator();
/* 47 */            while (it.hasNext()) {
/* 55 */                Object value2 = ((Map.Entry) it.next()).getValue();
/* 61 */                if (value2 instanceof zzagg) {
/* 65 */                    ((zzagg) value2).zzB();
                        }
                    }
/* 69 */            zzaiiVar.zza();
/* 73 */            this.zzb = true;
                }

                public final void zzi(zzafw zzafwVar) {
/* 1 */             zzaii zzaiiVar = zzafwVar.zza;
/* 3 */             int iZzc = zzaiiVar.zzc();
/* 8 */             for (int i = 0; i < iZzc; i++) {
/* 14 */                zzn(zzaiiVar.zzg(i));
                    }
/* 24 */            Iterator it = zzaiiVar.zzd().iterator();
/* 32 */            while (it.hasNext()) {
/* 40 */                zzn((Map.Entry) it.next());
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
                
                    if ((r4 instanceof com.google.android.gms.internal.mlkit_genai_speech.zzagi) == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
                
                    if ((r4 instanceof byte[]) == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
                
                    if (r0 == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
                
                    if ((r4 instanceof com.google.android.gms.internal.mlkit_genai_speech.zzagw) == false) goto L32;
                 */
                /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzj(zzafv zzafvVar, Object obj) {
                    boolean z;
/* 1 */             zzafvVar.zzg();
/* 4 */             zzafvVar.zzb();
/* 8 */             byte[] bArr = zzagp.zzb;
/* 10 */            obj.getClass();
/* 13 */            zzaiz zzaizVar = zzaiz.zza;
/* 15 */            zzaja zzajaVar = zzaja.INT;
                    switch (r0.zzb()) {
                        case INT:
/* 71 */                    z = obj instanceof Integer;
                            break;
                        case LONG:
/* 68 */                    z = obj instanceof Long;
                            break;
                        case FLOAT:
/* 65 */                    z = obj instanceof Float;
                            break;
                        case DOUBLE:
/* 62 */                    z = obj instanceof Double;
                            break;
                        case BOOLEAN:
/* 59 */                    z = obj instanceof Boolean;
                            break;
                        case STRING:
/* 56 */                    z = obj instanceof String;
                            break;
                        case BYTE_STRING:
/* 49 */                    if (!(obj instanceof zzafd)) {
                                break;
                            }
/* 77 */                    if (obj instanceof zzagw) {
/* 80 */                        this.zzc = true;
                            }
/* 84 */                    this.zza.put(zzafvVar, obj);
                            break;
                        case ENUM:
/* 40 */                    if (!(obj instanceof Integer)) {
                                break;
                            }
/* 77 */                    if (obj instanceof zzagw) {
                            }
/* 84 */                    this.zza.put(zzafvVar, obj);
                            break;
                        case MESSAGE:
/* 31 */                    if (!(obj instanceof zzahn)) {
                                break;
                            }
/* 77 */                    if (obj instanceof zzagw) {
                            }
/* 84 */                    this.zza.put(zzafvVar, obj);
                            break;
                        default:
/* 118 */                   OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzafvVar.zza()), zzafvVar.zzb().zzb(), obj.getClass().getName()});
                            break;
                    }
                }

                public final boolean zzl() {
/* 1 */             zzaii zzaiiVar = this.zza;
/* 3 */             int iZzc = zzaiiVar.zzc();
/* 9 */             for (int i = 0; i < iZzc; i++) {
/* 19 */                if (!zzo(zzaiiVar.zzg(i))) {
/* 7 */                     return false;
                        }
                    }
/* 29 */            Iterator it = zzaiiVar.zzd().iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                if (!zzo((Map.Entry) it.next())) {
/* 7 */                     return false;
                        }
                    }
/* 52 */            return true;
                }

/* 17 */        private zzafw() {
                }
            }
