            package com.google.android.gms.internal.mlkit_genai_speech;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public final class zzaiz {
                public static final zzaiz zza;
                public static final zzaiz zzb;
                public static final zzaiz zzc;
                public static final zzaiz zzd;
                public static final zzaiz zze;
                public static final zzaiz zzf;
                public static final zzaiz zzg;
                public static final zzaiz zzh;
                public static final zzaiz zzi;
                public static final zzaiz zzj;
                public static final zzaiz zzk;
                public static final zzaiz zzl;
                public static final zzaiz zzm;
                public static final zzaiz zzn;
                public static final zzaiz zzo;
                public static final zzaiz zzp;
                public static final zzaiz zzq;
                public static final zzaiz zzr;
                private static final zzaiz[] zzs;
                private final zzaja zzt;
                private final int zzu;

                static {
/* 9 */             zzaiz zzaizVar = new zzaiz("DOUBLE", 0, zzaja.DOUBLE, 1);
/* 12 */            zza = zzaizVar;
/* 21 */            zzaiz zzaizVar2 = new zzaiz("FLOAT", 1, zzaja.FLOAT, 5);
/* 24 */            zzb = zzaizVar2;
/* 28 */            zzaja zzajaVar = zzaja.LONG;
/* 33 */            zzaiz zzaizVar3 = new zzaiz("INT64", 2, zzajaVar, 0);
/* 36 */            zzc = zzaizVar3;
/* 43 */            zzaiz zzaizVar4 = new zzaiz("UINT64", 3, zzajaVar, 0);
/* 46 */            zzd = zzaizVar4;
/* 50 */            zzaja zzajaVar2 = zzaja.INT;
/* 55 */            zzaiz zzaizVar5 = new zzaiz("INT32", 4, zzajaVar2, 0);
/* 58 */            zze = zzaizVar5;
/* 64 */            zzaiz zzaizVar6 = new zzaiz("FIXED64", 5, zzajaVar, 1);
/* 67 */            zzf = zzaizVar6;
/* 75 */            zzaiz zzaizVar7 = new zzaiz("FIXED32", 6, zzajaVar2, 5);
/* 78 */            zzg = zzaizVar7;
/* 87 */            zzaiz zzaizVar8 = new zzaiz("BOOL", 7, zzaja.BOOLEAN, 0);
/* 90 */            zzh = zzaizVar8;
/* 101 */           zzaiz zzaizVar9 = new zzaiz("STRING", 8, zzaja.STRING, 2);
/* 104 */           zzi = zzaizVar9;
/* 108 */           zzaja zzajaVar3 = zzaja.MESSAGE;
/* 114 */           zzaiz zzaizVar10 = new zzaiz("GROUP", 9, zzajaVar3, 3);
/* 117 */           zzj = zzaizVar10;
/* 128 */           zzaiz zzaizVar11 = new zzaiz("MESSAGE", 10, zzajaVar3, 2);
/* 131 */           zzk = zzaizVar11;
/* 144 */           zzaiz zzaizVar12 = new zzaiz("BYTES", 11, zzaja.BYTE_STRING, 2);
/* 147 */           zzl = zzaizVar12;
/* 158 */           zzaiz zzaizVar13 = new zzaiz("UINT32", 12, zzajaVar2, 0);
/* 161 */           zzm = zzaizVar13;
/* 177 */           zzaiz zzaizVar14 = new zzaiz("ENUM", 13, zzaja.ENUM, 0);
/* 180 */           zzn = zzaizVar14;
/* 189 */           zzaiz zzaizVar15 = new zzaiz("SFIXED32", 14, zzajaVar2, 5);
/* 192 */           zzo = zzaizVar15;
/* 203 */           zzaiz zzaizVar16 = new zzaiz("SFIXED64", 15, zzajaVar, 1);
/* 206 */           zzp = zzaizVar16;
/* 217 */           zzaiz zzaizVar17 = new zzaiz("SINT32", 16, zzajaVar2, 0);
/* 220 */           zzq = zzaizVar17;
/* 228 */           zzaiz zzaizVar18 = new zzaiz("SINT64", 17, zzajaVar, 0);
/* 231 */           zzr = zzaizVar18;
/* 252 */           zzs = new zzaiz[]{zzaizVar, zzaizVar2, zzaizVar3, zzaizVar4, zzaizVar5, zzaizVar6, zzaizVar7, zzaizVar8, zzaizVar9, zzaizVar10, zzaizVar11, zzaizVar12, zzaizVar13, zzaizVar14, zzaizVar15, zzaizVar16, zzaizVar17, zzaizVar18};
                }

                private zzaiz(String str, int i, zzaja zzajaVar, int i2) {
/* 4 */             this.zzt = zzajaVar;
/* 6 */             this.zzu = i2;
                }

                public static zzaiz[] values() {
/* 7 */             return (zzaiz[]) zzs.clone();
                }

                public final int zza() {
/* 1 */             return this.zzu;
                }

                public final zzaja zzb() {
/* 1 */             return this.zzt;
                }
            }
