            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Executor;
            
            enum zziv implements Executor {
                INSTANCE;

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             runnable.run();
                }

                @Override
                public final String toString() {
/* 1 */             return "MoreExecutors.directExecutor()";
                }
            }
