            package com.google.research.xeno.effect;

            import java.util.Map;
            
            public class AssetRegistry {
                public final long I00000oIO = nativeCreateAssetRegistry();

                public AssetRegistry(Map map) {
/* 22 */            for (Map.Entry entry : map.entrySet()) {
/* 44 */                nativeRegisterAsset(this.I00000oIO, (String) entry.getKey(), (String) entry.getValue());
                    }
                }

                private native long nativeCreateAssetRegistry();

                private native void nativeRegisterAsset(long j, String str, String str2);
            }
