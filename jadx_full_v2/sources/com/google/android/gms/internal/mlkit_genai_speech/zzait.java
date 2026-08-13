            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import p000.OoOil11Ol1o;
            import sun.misc.Unsafe;
            
            final class zzait {
                static final long zza;
                static final boolean zzb;
                private static final Unsafe zzc;
                private static final Class zzd;
                private static final boolean zze;
                private static final zzais zzf;
                private static final boolean zzg;
                private static final boolean zzh;

                /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
                static {
                    boolean z;
                    boolean z2;
                    zzais zzaisVar;
/* 1 */             Unsafe unsafeZzg = zzg();
/* 5 */             zzc = unsafeZzg;
/* 7 */             int i = zzaes.zza;
/* 11 */            zzd = Memory.class;
/* 13 */            Class cls = Long.TYPE;
/* 15 */            boolean zZzv = zzv(cls);
/* 19 */            zze = zZzv;
/* 21 */            Class cls2 = Integer.TYPE;
/* 23 */            boolean zZzv2 = zzv(cls2);
/* 27 */            zzais zzaiqVar = null;
/* 28 */            if (unsafeZzg != null) {
/* 31 */                if (zZzv) {
/* 35 */                    zzaiqVar = new zzair(unsafeZzg);
                        } else if (zZzv2) {
/* 43 */                    zzaiqVar = new zzaiq(unsafeZzg);
                        }
                    }
/* 46 */            zzf = zzaiqVar;
/* 58 */            if (zzaiqVar == null) {
/* 60 */                z = false;
                    } else {
                        try {
/* 64 */                    Class<?> cls3 = zzaiqVar.zza.getClass();
/* 72 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 79 */                    cls3.getMethod("getLong", Object.class, cls);
/* 86 */                    if (zzB() != null) {
/* 89 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 92 */                    zzh(th);
                        }
                    }
/* 96 */            zzg = z;
/* 98 */            zzais zzaisVar2 = zzf;
/* 100 */           if (zzaisVar2 == null) {
/* 102 */               z2 = false;
                    } else {
                        try {
/* 106 */                   Class<?> cls4 = zzaisVar2.zza.getClass();
/* 114 */                   cls4.getMethod("objectFieldOffset", Field.class);
/* 125 */                   cls4.getMethod("arrayBaseOffset", Class.class);
/* 134 */                   cls4.getMethod("arrayIndexScale", Class.class);
/* 143 */                   cls4.getMethod("getInt", Object.class, cls);
/* 152 */                   cls4.getMethod("putInt", Object.class, cls, cls2);
/* 159 */                   cls4.getMethod("getLong", Object.class, cls);
/* 168 */                   cls4.getMethod("putLong", Object.class, cls, cls);
/* 177 */                   cls4.getMethod("getObject", Object.class, cls);
/* 186 */                   cls4.getMethod("putObject", Object.class, cls, Object.class);
/* 189 */                   z2 = true;
                        } catch (Throwable th2) {
/* 192 */                   zzh(th2);
                        }
                    }
/* 196 */           zzh = z2;
/* 205 */           zza = zzz(byte[].class);
/* 209 */           zzz(boolean[].class);
/* 212 */           zzA(boolean[].class);
/* 217 */           zzz(int[].class);
/* 220 */           zzA(int[].class);
/* 225 */           zzz(long[].class);
/* 228 */           zzA(long[].class);
/* 233 */           zzz(float[].class);
/* 236 */           zzA(float[].class);
/* 241 */           zzz(double[].class);
/* 244 */           zzA(double[].class);
/* 249 */           zzz(Object[].class);
/* 252 */           zzA(Object[].class);
/* 255 */           Field fieldZzB = zzB();
/* 259 */           if (fieldZzB != null && (zzaisVar = zzf) != null) {
/* 267 */               zzaisVar.zza.objectFieldOffset(fieldZzB);
                    }
/* 280 */           zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                private zzait() {
                }

                private static int zzA(Class cls) {
/* 3 */             if (zzh) {
/* 9 */                 return zzf.zza.arrayIndexScale(cls);
                    }
/* 14 */            return -1;
                }

                private static Field zzB() {
/* 1 */             int i = zzaes.zza;
/* 7 */             Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
/* 11 */            if (fieldZzC != null) {
/* 55 */                return fieldZzC;
                    }
/* 15 */            Field fieldZzC2 = zzC(Buffer.class, "address");
/* 19 */            if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
/* 30 */                return null;
                    }
/* 29 */            return fieldZzC2;
                }

                private static Field zzC(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (Throwable unused) {
/* 6 */                 return null;
                    }
                }

                private static void zzD(Object obj, long j, byte b) {
/* 3 */             Unsafe unsafe = zzf.zza;
/* 7 */             long j2 = (-4) & j;
/* 8 */             int i = unsafe.getInt(obj, j2);
/* 16 */            int i2 = ((~((int) j)) & 3) << 3;
/* 28 */            unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
                }

                private static void zzE(Object obj, long j, byte b) {
/* 3 */             Unsafe unsafe = zzf.zza;
/* 7 */             long j2 = (-4) & j;
/* 15 */            int i = (((int) j) & 3) << 3;
/* 27 */            unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
                }

                public static double zza(Object obj, long j) {
/* 3 */             return zzf.zza(obj, j);
                }

                public static float zzb(Object obj, long j) {
/* 3 */             return zzf.zzb(obj, j);
                }

                public static int zzc(Object obj, long j) {
/* 5 */             return zzf.zza.getInt(obj, j);
                }

                public static long zzd(Object obj, long j) {
/* 5 */             return zzf.zza.getLong(obj, j);
                }

                public static Object zze(Class cls) {
                    try {
/* 3 */                 return zzc.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 OoOil11Ol1o.I000oI1ioi(e);
/* 12 */                return null;
                    }
                }

                public static Object zzf(Object obj, long j) {
/* 5 */             return zzf.zza.getObject(obj, j);
                }

                public static Unsafe zzg() {
                    Unsafe unsafe;
                    try {
/* 11 */                unsafe = (Unsafe) AccessController.doPrivileged(new zzaip());
                    } catch (Throwable unused) {
/* 14 */                unsafe = null;
                    }
/* 15 */            if (unsafe == null) {
/* 1 */                 return null;
                    }
                    try {
/* 20 */                unsafe.arrayBaseOffset(byte[].class);
/* 23 */                return unsafe;
                    } catch (Exception unused2) {
/* 42 */                Logger.getLogger(zzait.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
/* 1 */                 return null;
                    }
                }

                public static void zzh(Throwable th) {
/* 27 */            Logger.getLogger(zzait.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }

                public static void zzm(Object obj, long j, boolean z) {
/* 3 */             zzf.zzc(obj, j, z);
                }

                public static void zzn(byte[] bArr, long j, byte b) {
/* 6 */             zzf.zzd(bArr, zza + j, b);
                }

                public static void zzo(Object obj, long j, double d) {
/* 6 */             zzf.zze(obj, j, d);
                }

                public static void zzp(Object obj, long j, float f) {
/* 3 */             zzf.zzf(obj, j, f);
                }

                public static void zzq(Object obj, long j, int i) {
/* 5 */             zzf.zza.putInt(obj, j, i);
                }

                public static void zzr(Object obj, long j, long j2) {
/* 8 */             zzf.zza.putLong(obj, j, j2);
                }

                public static void zzs(Object obj, long j, Object obj2) {
/* 5 */             zzf.zza.putObject(obj, j, obj2);
                }

                public static boolean zzt(Object obj, long j) {
                    return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static boolean zzu(Object obj, long j) {
                    return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static boolean zzv(Class cls) {
/* 1 */             int i = zzaes.zza;
                    try {
/* 3 */                 Class cls2 = zzd;
/* 7 */                 Class cls3 = Boolean.TYPE;
/* 13 */                cls2.getMethod("peekLong", cls, cls3);
/* 24 */                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
/* 29 */                Class cls4 = Integer.TYPE;
/* 35 */                cls2.getMethod("pokeInt", cls, cls4, cls3);
/* 44 */                cls2.getMethod("peekInt", cls, cls3);
/* 55 */                cls2.getMethod("pokeByte", cls, Byte.TYPE);
/* 64 */                cls2.getMethod("peekByte", cls);
/* 75 */                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
/* 84 */                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
/* 87 */                return true;
                    } catch (Throwable unused) {
/* 89 */                return false;
                    }
                }

                public static boolean zzw(Object obj, long j) {
/* 3 */             return zzf.zzg(obj, j);
                }

                public static boolean zzx() {
/* 1 */             return zzh;
                }

                public static boolean zzy() {
/* 1 */             return zzg;
                }

                private static int zzz(Class cls) {
/* 3 */             if (zzh) {
/* 9 */                 return zzf.zza.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }
            }
