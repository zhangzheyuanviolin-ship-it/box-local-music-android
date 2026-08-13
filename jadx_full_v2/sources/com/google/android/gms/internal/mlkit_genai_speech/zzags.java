            package com.google.android.gms.internal.mlkit_genai_speech;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public final class zzags {
                public static final zzags zza;
                public static final zzags zzb;
                public static final zzags zzc;
                public static final zzags zzd;
                public static final zzags zze;
                public static final zzags zzf;
                public static final zzags zzg;
                public static final zzags zzh;
                public static final zzags zzi;
                public static final zzags zzj;
                private static final zzags[] zzk;
                private final Class zzl;

                static {
/* 10 */            zzags zzagsVar = new zzags("VOID", 0, Void.class, Void.class, null);
/* 13 */            zza = zzagsVar;
/* 24 */            Class cls = Integer.TYPE;
/* 28 */            zzags zzagsVar2 = new zzags("INT", 1, cls, Integer.class, 0);
/* 31 */            zzb = zzagsVar2;
/* 49 */            zzags zzagsVar3 = new zzags("LONG", 2, Long.TYPE, Long.class, 0L);
/* 52 */            zzc = zzagsVar3;
/* 69 */            zzags zzagsVar4 = new zzags("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
/* 72 */            zzd = zzagsVar4;
/* 89 */            zzags zzagsVar5 = new zzags("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
/* 92 */            zze = zzagsVar5;
/* 105 */           zzags zzagsVar6 = new zzags("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
/* 109 */           zzf = zzagsVar6;
/* 121 */           zzags zzagsVar7 = new zzags("STRING", 6, String.class, String.class, "");
/* 125 */           zzg = zzagsVar7;
/* 137 */           zzags zzagsVar8 = new zzags("BYTE_STRING", 7, zzafd.class, zzafd.class, zzafd.zza);
/* 141 */           zzh = zzagsVar8;
/* 152 */           zzags zzagsVar9 = new zzags("ENUM", 8, cls, Integer.class, null);
/* 155 */           zzi = zzagsVar9;
/* 169 */           zzags zzagsVar10 = new zzags("MESSAGE", 9, Object.class, Object.class, null);
/* 172 */           zzj = zzagsVar10;
/* 185 */           zzk = new zzags[]{zzagsVar, zzagsVar2, zzagsVar3, zzagsVar4, zzagsVar5, zzagsVar6, zzagsVar7, zzagsVar8, zzagsVar9, zzagsVar10};
                }

                private zzags(String str, int i, Class cls, Class cls2, Object obj) {
/* 4 */             this.zzl = cls2;
                }

                public static zzags[] values() {
/* 7 */             return (zzags[]) zzk.clone();
                }

                public final Class zza() {
/* 1 */             return this.zzl;
                }
            }
