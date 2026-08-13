            package com.google.mlkit.vision.mediapipe.segmentation;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy;
            import com.google.mlkit.vision.mediapipe.Converter;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.List;
            import p000.lII0I0I000I;
            
            public class SegmentationMaskConverter implements Converter<SegmentationMaskHolder> {
                @Override
                public final Object zza(List list) {
/* 13 */            lII0I0I000I.I00000oIO("The output of Segmentation contains more than one packet, which is not expected.", list.size() == 1);
/* 20 */            zzhv zzhvVar = (zzhv) list.get(0);
/* 22 */            int iZzb = zzhy.zzb(zzhvVar);
/* 26 */            int iZza = zzhy.zza(zzhvVar);
/* 42 */            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZzb * iZza * 4).order(ByteOrder.nativeOrder());
/* 46 */            zzhy.zzd(zzhvVar, byteBufferOrder);
/* 51 */            return new SegmentationMaskHolder(byteBufferOrder, iZzb, iZza);
                }
            }
