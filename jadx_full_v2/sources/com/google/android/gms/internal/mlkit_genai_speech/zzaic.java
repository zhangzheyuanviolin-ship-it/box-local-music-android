            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.OooioIOo1;
            
            final class zzaic {
                public static final int zza = 0;
                private static final zzaim zzb;

                static {
/* 1 */             int i = zzaes.zza;
/* 8 */             zzb = new zzaio();
                }

                public static void zzA(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzz(i, list, z);
                }

                public static void zzB(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzB(i, list, z);
                }

                public static void zzC(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzD(i, list, z);
                }

                public static void zzD(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzF(i, list, z);
                }

                public static void zzE(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzK(i, list, z);
                }

                public static void zzF(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzM(i, list, z);
                }

                public static boolean zzG(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                @Deprecated
                public static int zza(int i, zzahn zzahnVar, zzaia zzaiaVar) {
/* 3 */             int iZzy = zzafm.zzy(i << 3);
/* 14 */            return ((zzaeo) zzahnVar).zzj(zzaiaVar) + iZzy + iZzy;
                }

                public static int zzb(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzagh)) {
/* 32 */                int iZzz = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzz += zzafm.zzz(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iZzz;
                    }
/* 13 */            zzagh zzaghVar = (zzagh) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzz2 += zzafm.zzz(zzaghVar.zze(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzz2;
                }

                public static int zzc(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzafm.zzy(i << 3) + 4) * size;
                }

                public static int zzd(List list) {
/* 5 */             return list.size() * 4;
                }

                public static int zze(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzafm.zzy(i << 3) + 8) * size;
                }

                public static int zzf(List list) {
/* 5 */             return list.size() * 8;
                }

                public static int zzg(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzagh)) {
/* 32 */                int iZzz = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzz += zzafm.zzz(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iZzz;
                    }
/* 13 */            zzagh zzaghVar = (zzagh) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzz2 += zzafm.zzz(zzaghVar.zze(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzz2;
                }

                public static int zzh(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzahb)) {
/* 31 */                int iZzz = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzz += zzafm.zzz(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iZzz;
                    }
/* 13 */            zzahb zzahbVar = (zzahb) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzz2 += zzafm.zzz(zzahbVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzz2;
                }

                public static int zzi(int i, Object obj, zzaia zzaiaVar) {
/* 1 */             int i2 = i << 3;
/* 5 */             if (obj instanceof zzagx) {
/* 9 */                 int iZzy = zzafm.zzy(i2);
/* 13 */                int iZza = ((zzagx) obj).zza();
/* 17 */                return OooioIOo1.I001l0I00(iZza, iZza, iZzy);
                    }
/* 24 */            int iZzy2 = zzafm.zzy(i2);
/* 28 */            int iZzj = ((zzaeo) obj).zzj(zzaiaVar);
/* 32 */            return OooioIOo1.I001l0I00(iZzj, iZzj, iZzy2);
                }

                public static int zzj(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzagh)) {
/* 36 */                int iZzy = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iZzy += zzafm.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 77 */                return iZzy;
                    }
/* 13 */            zzagh zzaghVar = (zzagh) list;
/* 15 */            int iZzy2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iZze = zzaghVar.zze(i);
/* 31 */                iZzy2 += zzafm.zzy((iZze >> 31) ^ (iZze + iZze));
/* 32 */                i++;
                    }
/* 35 */            return iZzy2;
                }

                public static int zzk(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof zzahb)) {
/* 37 */                int iZzz = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iZzz += zzafm.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 77 */                return iZzz;
                    }
/* 15 */            zzahb zzahbVar = (zzahb) list;
/* 17 */            int iZzz2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jZze = zzahbVar.zze(i);
/* 32 */                iZzz2 += zzafm.zzz((jZze >> 63) ^ (jZze + jZze));
/* 33 */                i++;
                    }
/* 36 */            return iZzz2;
                }

                public static int zzl(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzagh)) {
/* 31 */                int iZzy = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzy += zzafm.zzy(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 77 */                return iZzy;
                    }
/* 13 */            zzagh zzaghVar = (zzagh) list;
/* 15 */            int iZzy2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzy2 += zzafm.zzy(zzaghVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzy2;
                }

                public static int zzm(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzahb)) {
/* 31 */                int iZzz = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzz += zzafm.zzz(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iZzz;
                    }
/* 13 */            zzahb zzahbVar = (zzahb) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzz2 += zzafm.zzz(zzahbVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzz2;
                }

                public static zzaim zzn() {
/* 1 */             return zzb;
                }

                public static Object zzo(Object obj, int i, List list, zzagk zzagkVar, Object obj2, zzaim zzaimVar) {
/* 1 */             if (zzagkVar == null) {
/* 3 */                 return obj2;
                    }
/* 6 */             if (!(list instanceof RandomAccess)) {
/* 57 */                Iterator it = list.iterator();
/* 65 */                while (it.hasNext()) {
/* 73 */                    int iIntValue = ((Integer) it.next()).intValue();
/* 81 */                    if (!zzagkVar.zza(iIntValue)) {
/* 83 */                        obj2 = zzp(obj, i, iIntValue, obj2, zzaimVar);
/* 87 */                        it.remove();
                            }
                        }
/* 685 */               return obj2;
                    }
/* 8 */             int size = list.size();
/* 13 */            int i2 = 0;
/* 14 */            for (int i3 = 0; i3 < size; i3++) {
/* 20 */                Integer num = (Integer) list.get(i3);
/* 22 */                int iIntValue2 = num.intValue();
/* 30 */                if (zzagkVar.zza(iIntValue2)) {
/* 32 */                    if (i3 != i2) {
/* 34 */                        list.set(i2, num);
                            }
/* 37 */                    i2++;
                        } else {
/* 40 */                    obj2 = zzp(obj, i, iIntValue2, obj2, zzaimVar);
                        }
                    }
/* 47 */            if (i2 != size) {
/* 53 */                list.subList(i2, size).clear();
                    }
/* 56 */            return obj2;
                }

                public static Object zzp(Object obj, int i, int i2, Object obj2, zzaim zzaimVar) {
/* 1 */             if (obj2 == null) {
/* 3 */                 obj2 = zzaimVar.zza(obj);
                    }
/* 8 */             zzaimVar.zzh(obj2, i, i2);
/* 399 */           return obj2;
                }

                public static void zzq(zzafs zzafsVar, Object obj, Object obj2) {
/* 3 */             zzafw zzafwVar = ((zzagd) obj2).zzb;
/* 11 */            if (zzafwVar.zza.isEmpty()) {
/* 98 */                return;
                    }
/* 17 */            zzafsVar.zza(obj).zzi(zzafwVar);
                }

                public static void zzr(zzaim zzaimVar, Object obj, Object obj2) {
/* 1 */             zzagg zzaggVar = (zzagg) obj;
/* 3 */             zzain zzainVarZze = zzaggVar.zzc;
/* 7 */             zzain zzainVar = ((zzagg) obj2).zzc;
/* 17 */            if (!zzain.zzc().equals(zzainVar)) {
/* 27 */                if (zzain.zzc().equals(zzainVarZze)) {
/* 29 */                    zzainVarZze = zzain.zze(zzainVarZze, zzainVar);
                        } else {
/* 34 */                    zzainVarZze.zzd(zzainVar);
                        }
                    }
/* 37 */            zzaggVar.zzc = zzainVarZze;
                }

                public static void zzs(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzc(i, list, z);
                }

                public static void zzt(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzg(i, list, z);
                }

                public static void zzu(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzj(i, list, z);
                }

                public static void zzv(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzl(i, list, z);
                }

                public static void zzw(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzn(i, list, z);
                }

                public static void zzx(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzp(i, list, z);
                }

                public static void zzy(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzs(i, list, z);
                }

                public static void zzz(int i, List list, zzajb zzajbVar, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 9 */             zzajbVar.zzu(i, list, z);
                }
            }
