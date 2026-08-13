            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.android.gms.internal.mlkit_genai_speech.zzaga;
            import com.google.android.gms.internal.mlkit_genai_speech.zzagg;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            import p000.IoOOl0iOl1io;
            import p000.OIiilo1Ool0o;
            import p000.Oi010OO0;
            
            public abstract class zzagg<MessageType extends zzagg<MessageType, BuilderType>, BuilderType extends zzaga<MessageType, BuilderType>> extends zzaeo<MessageType, BuilderType> {
                private static final Map zzb = new ConcurrentHashMap();
                public static final int zzd = 0;
                private int zze = -1;
                protected zzain zzc = zzain.zzc();

                public static Object zzA(zzahn zzahnVar, String str, Object[] objArr) {
/* 3 */             return new zzahy(zzahnVar, str, objArr);
                }

                public static void zzD(Class cls, zzagg zzaggVar) {
/* 1 */             zzaggVar.zzC();
/* 6 */             zzb.put(cls, zzaggVar);
                }

                private final int zzc(zzaia zzaiaVar) {
/* 13 */            return zzahw.zza().zzb(getClass()).zza(this);
                }

                private static final boolean zze(zzagg zzaggVar, boolean z) {
/* 9 */             byte bByteValue = ((Byte) zzaggVar.zzb(1, null, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 32 */            boolean zZzi = zzahw.zza().zzb(zzaggVar.getClass()).zzi(zzaggVar);
/* 36 */            if (z) {
/* 44 */                zzaggVar.zzb(2, true != zZzi ? null : zzaggVar, null);
                    }
/* 106 */           return zZzi;
                }

                public static zzagf zzq(zzahn zzahnVar, Object obj, zzahn zzahnVar2, zzagj zzagjVar, int i, zzaiz zzaizVar, Class cls) {
/* 18 */            return new zzagf(zzahnVar, obj, zzahnVar2, new zzage(null, i, zzaizVar, false, false), cls);
                }

                public static zzagg zzr(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             zzagg zzaggVar = (zzagg) map.get(cls);
/* 10 */            if (zzaggVar == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    zzaggVar = (zzagg) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (zzaggVar != null) {
/* 77 */                return zzaggVar;
                    }
/* 51 */            zzagg zzaggVar2 = (zzagg) ((zzagg) zzait.zze(cls)).zzb(6, null, null);
/* 53 */            if (zzaggVar2 != null) {
/* 55 */                map.put(cls, zzaggVar2);
/* 58 */                return zzaggVar2;
                    }
/* 59 */            IOOlIIilOl0.I000iOII();
/* 9 */             return null;
                }

                public static zzagl zzu() {
/* 1 */             return zzafy.zzf();
                }

                public static zzagm zzv() {
/* 1 */             return zzagh.zzf();
                }

                public static zzagn zzw() {
/* 1 */             return zzahb.zzf();
                }

                public static zzago zzx() {
/* 1 */             return zzahx.zze();
                }

                public static Object zzz(Method method, Object obj, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(obj, objArr);
                    } catch (IllegalAccessException e) {
/* 35 */                OIiilo1Ool0o.I000iOII("Couldn't use Java reflection to implement protocol message reflection.", e);
/* 1 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 8 */                 Throwable cause = e2.getCause();
/* 14 */                if (cause instanceof RuntimeException) {
/* 31 */                    throw ((RuntimeException) cause);
                        }
/* 18 */                if (cause instanceof Error) {
/* 28 */                    throw ((Error) cause);
                        }
/* 22 */                OIiilo1Ool0o.I000iOII("Unexpected exception thrown by generated accessor method.", cause);
/* 1 */                 return null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 34 */            return zzahw.zza().zzb(getClass()).zzh(this, (zzagg) obj);
                }

                public final int hashCode() {
/* 5 */             if (zzG()) {
/* 18 */                return zzm();
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 17 */                return i;
                    }
/* 11 */            int iZzm = zzm();
/* 15 */            this.zza = iZzm;
/* 17 */            return iZzm;
                }

                public final String toString() {
/* 5 */             return zzahp.zza(this, super.toString());
                }

                public final void zzB() {
/* 13 */            zzahw.zza().zzb(getClass()).zzd(this);
/* 16 */            zzC();
                }

                public final void zzC() {
                    this.zze &= Integer.MAX_VALUE;
                }

                public final void zzE(int i) {
/* 10 */            this.zze = (this.zze & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean zzG() {
                    return (this.zze & Integer.MIN_VALUE) != 0;
                }

                @Override
                public final zzahm zzH() {
/* 7 */             return (zzaga) zzb(5, null, null);
                }

                @Override
                public final zzahm zzI() {
/* 7 */             zzaga zzagaVar = (zzaga) zzb(5, null, null);
/* 9 */             zzagaVar.zzk(this);
/* 20 */            return zzagaVar;
                }

                @Override
                public final void zzJ(zzafm zzafmVar) {
/* 17 */            zzahw.zza().zzb(getClass()).zzg(this, zzafn.zza(zzafmVar));
                }

                public abstract Object zzb(int i, Object obj, Object obj2);

                @Override
                public final int zzj(zzaia zzaiaVar) {
/* 7 */             if (zzG()) {
/* 9 */                 int iZza = zzaiaVar.zza(this);
/* 13 */                if (iZza >= 0) {
/* 15 */                    return iZza;
                        }
/* 20 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iZza, "serialized size must be non-negative, was "));
/* 23 */                return 0;
                    }
/* 30 */            int i = this.zze & Integer.MAX_VALUE;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 33 */            int iZza2 = zzaiaVar.zza(this);
/* 37 */            if (iZza2 >= 0) {
/* 45 */                this.zze = (this.zze & Integer.MIN_VALUE) | iZza2;
/* 47 */                return iZza2;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iZza2, "serialized size must be non-negative, was "));
/* 23 */            return 0;
                }

                public final int zzm() {
/* 13 */            return zzahw.zza().zzb(getClass()).zzb(this);
                }

                @Override
                public final int zzn() {
/* 8 */             if (zzG()) {
/* 10 */                int iZzc = zzc(null);
/* 14 */                if (iZzc >= 0) {
/* 16 */                    return iZzc;
                        }
/* 21 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iZzc, "serialized size must be non-negative, was "));
/* 24 */                return 0;
                    }
/* 31 */            int i = this.zze & Integer.MAX_VALUE;
/* 32 */            if (i != Integer.MAX_VALUE) {
/* 34 */                return i;
                    }
/* 35 */            int iZzc2 = zzc(null);
/* 39 */            if (iZzc2 >= 0) {
/* 47 */                this.zze = (this.zze & Integer.MIN_VALUE) | iZzc2;
/* 49 */                return iZzc2;
                    }
/* 54 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iZzc2, "serialized size must be non-negative, was "));
/* 24 */            return 0;
                }

                public final zzaga zzo() {
/* 7 */             return (zzaga) zzb(5, null, null);
                }

                @Override
                public final zzahn zzp() {
/* 7 */             return (zzagg) zzb(6, null, null);
                }

                @Override
                public final boolean zzs() {
/* 2 */             return zze(this, true);
                }

                public final zzagg zzt() {
/* 7 */             return (zzagg) zzb(4, null, null);
                }

                @Override
                public final zzahv zzy() {
/* 7 */             return (zzahv) zzb(7, null, null);
                }
            }
