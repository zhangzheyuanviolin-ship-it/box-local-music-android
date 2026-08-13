            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.android.gms.internal.mlkit_genai_speech.zzaen;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaeo;
            import java.io.IOException;
            import p000.IlIi0I0;
            import p000.OIiilo1Ool0o;
            
            public abstract class zzaeo<MessageType extends zzaeo<MessageType, BuilderType>, BuilderType extends zzaen<MessageType, BuilderType>> implements zzahn {
                protected transient int zza = 0;

                public int zzj(zzaia zzaiaVar) {
/* 29 */            throw null;
                }

                @Override
                public final zzafd zzk() {
                    try {
/* 1 */                 int iZzn = zzn();
/* 5 */                 zzafd zzafdVar = zzafd.zza;
/* 7 */                 byte[] bArr = new byte[iZzn];
/* 9 */                 int i = zzafm.zzb;
/* 14 */                zzafj zzafjVar = new zzafj(bArr, 0, iZzn);
/* 17 */                zzJ(zzafjVar);
/* 20 */                return zzaez.zza(zzafjVar, bArr);
                    } catch (IOException e) {
/* 42 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
/* 45 */                return null;
                    }
                }

                @Override
                public final byte[] zzl() {
                    try {
/* 1 */                 int iZzn = zzn();
/* 5 */                 byte[] bArr = new byte[iZzn];
/* 7 */                 int i = zzafm.zzb;
/* 12 */                zzafj zzafjVar = new zzafj(bArr, 0, iZzn);
/* 15 */                zzJ(zzafjVar);
/* 18 */                zzafjVar.zzB();
/* 21 */                return bArr;
                    } catch (IOException e) {
/* 39 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 42 */                return null;
                    }
                }
            }
