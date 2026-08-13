            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public enum zzbnf implements zzbfl {
                SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
                CONNECTION_RESET("connection reset"),
                CONNECTION_TIMED_OUT("connection timed out"),
                CONNECTION_ABORTED("connection aborted"),
                SOCKET_ERROR("socket error"),
                UNKNOWN("unknown");

                private final String zzh;

                zzbnf(String str) {
/* 4 */             this.zzh = str;
                }

                @Override
                public final String zza() {
/* 1 */             return this.zzh;
                }
            }
