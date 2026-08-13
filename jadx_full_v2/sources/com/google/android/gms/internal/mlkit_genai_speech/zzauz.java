            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            import p000.OIiilo1Ool0o;
            
            final class zzauz {
                static final zzava zza;

                static {
                    zzava zzaznVar;
/* 3 */             AtomicReference atomicReference = new AtomicReference();
                    try {
/* 27 */                zzaznVar = (zzava) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzava.class).getConstructor(null).newInstance(null);
                    } catch (ClassNotFoundException e) {
/* 39 */                atomicReference.set(e);
/* 44 */                zzaznVar = new zzazn();
                    } catch (Exception e2) {
/* 35 */                OIiilo1Ool0o.I000iOII("Storage override failed to initialize", e2);
/* 38 */                return;
                    }
/* 47 */            zza = zzaznVar;
/* 54 */            Throwable th = (Throwable) atomicReference.get();
/* 56 */            if (th != null) {
/* 68 */                zzavb.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
                    }
                }
            }
