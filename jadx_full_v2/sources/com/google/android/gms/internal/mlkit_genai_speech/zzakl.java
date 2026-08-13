            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzakl implements zzagk {
                static final zzagk zza = new zzakl();

                private zzakl() {
                }

                @Override
                public final boolean zza(int i) {
                    zzakm zzakmVar;
                    switch (i) {
                        case 0:
/* 36 */                    zzakmVar = zzakm.UNKNOWN;
                            break;
                        case 1:
/* 33 */                    zzakmVar = zzakm.DEFAULT_ONESHOT;
                            break;
                        case 2:
/* 30 */                    zzakmVar = zzakm.DEFAULT_CONTINUOUS;
                            break;
                        case 3:
/* 27 */                    zzakmVar = zzakm.AMBIENT_ONESHOT;
                            break;
                        case 4:
/* 24 */                    zzakmVar = zzakm.AMBIENT_CONTINUOUS;
                            break;
                        case 5:
/* 21 */                    zzakmVar = zzakm.FARFIELD_ONESHOT;
                            break;
                        case 6:
/* 18 */                    zzakmVar = zzakm.FARFIELD_CONTINUOUS;
                            break;
                        case 7:
/* 15 */                    zzakmVar = zzakm.AMBIENT_TELEPHONY;
                            break;
                        case 8:
                        default:
/* 4 */                     zzakmVar = null;
                            break;
                        case 9:
/* 12 */                    zzakmVar = zzakm.NATCON_ONESHOT;
                            break;
                        case 10:
/* 9 */                     zzakmVar = zzakm.HIGH_QUALITY_CONTINUOUS;
                            break;
                        case 11:
/* 6 */                     zzakmVar = zzakm.BALANCED_CONTINUOUS;
                            break;
                    }
                    return zzakmVar != null;
                }
            }
