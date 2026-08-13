            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzaik {
                public static String zza(zzafd zzafdVar) {
/* 7 */             StringBuilder sb = new StringBuilder(zzafdVar.zze());
/* 15 */            for (int i = 0; i < zzafdVar.zze(); i++) {
/* 17 */                byte bZza = zzafdVar.zza(i);
/* 23 */                if (bZza == 34) {
/* 137 */                   sb.append("\\\"");
                        } else if (bZza == 39) {
/* 131 */                   sb.append("\\'");
                        } else if (bZza != 92) {
                            switch (bZza) {
                                case 7:
/* 119 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 113 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 107 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 101 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 95 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 89 */                            sb.append("\\f");
                                    break;
                                case 13:
/* 83 */                            sb.append("\\r");
                                    break;
                                default:
/* 38 */                            if (bZza < 32 || bZza > 126) {
/* 49 */                                sb.append('\\');
/* 59 */                                sb.append((char) (((bZza >>> 6) & 3) + 48));
/* 69 */                                sb.append((char) (((bZza >>> 3) & 7) + 48));
/* 77 */                                sb.append((char) ((bZza & 7) + 48));
                                        break;
                                    } else {
/* 45 */                                sb.append((char) bZza);
                                        break;
                                    }
                            }
                        } else {
/* 125 */                   sb.append("\\\\");
                        }
                    }
/* 144 */           return sb.toString();
                }
            }
