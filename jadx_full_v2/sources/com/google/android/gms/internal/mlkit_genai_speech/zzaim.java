            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.OoOil11Ol1o;
            
            abstract class zzaim {
                private static volatile int zza = 100;

                public abstract Object zza(Object obj);

                public abstract Object zzb();

                public abstract Object zzc(Object obj);

                public abstract void zzd(Object obj, int i, int i2);

                public abstract void zze(Object obj, int i, long j);

                public abstract void zzf(Object obj, int i, Object obj2);

                public abstract void zzg(Object obj, int i, zzafd zzafdVar);

                public abstract void zzh(Object obj, int i, long j);

                public abstract void zzi(Object obj);

                public abstract void zzj(Object obj, Object obj2);

                public final boolean zzk(Object obj, zzahz zzahzVar, int i) throws zzagr {
/* 1 */             int iZzd = zzahzVar.zzd();
/* 5 */             int i2 = iZzd >>> 3;
/* 7 */             int i3 = iZzd & 7;
/* 10 */            if (i3 == 0) {
/* 120 */               zzh(obj, i2, zzahzVar.zzl());
/* 9 */                 return true;
                    }
/* 12 */            if (i3 == 1) {
/* 112 */               zze(obj, i2, zzahzVar.zzk());
/* 9 */                 return true;
                    }
/* 15 */            if (i3 == 2) {
/* 104 */               zzg(obj, i2, zzahzVar.zzp());
/* 9 */                 return true;
                    }
/* 22 */            if (i3 != 3) {
/* 24 */                if (i3 == 4) {
/* 41 */                    if (i != 0) {
/* 17 */                        return false;
                            }
/* 44 */                    OoOil11Ol1o.I001i1O0Ol("Protocol message end-group tag did not match expected tag.");
/* 17 */                    return false;
                        }
/* 27 */                if (i3 == 5) {
/* 33 */                    zzd(obj, i2, zzahzVar.zzf());
/* 9 */                     return true;
                        }
/* 37 */                OoOil11Ol1o.I00111O();
/* 17 */                return false;
                    }
/* 48 */            Object objZzb = zzb();
/* 52 */            int i4 = i2 << 3;
/* 54 */            int i5 = i + 1;
/* 57 */            if (i5 >= zza) {
/* 96 */                OoOil11Ol1o.I001i1O0Ol("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 17 */                return false;
                    }
/* 66 */            while (zzahzVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzahzVar, i5)) {
                    }
/* 80 */            if ((i4 | 4) == zzahzVar.zzd()) {
/* 86 */                zzf(obj, i2, zzc(objZzb));
/* 9 */                 return true;
                    }
/* 90 */            OoOil11Ol1o.I001i1O0Ol("Protocol message end-group tag did not match expected tag.");
/* 17 */            return false;
                }
            }
