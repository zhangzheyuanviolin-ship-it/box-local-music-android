            package p000;

            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class II1iIoo {
                public static final O1oIOiI11o0 I00000oIO;
                public static final List I00000oOI;
                public static final List I0000Il00O;

                static {
/* 91 */            O1oIOiI11o0 o1oIOiI11o0 = new O1oIOiI11o0("Box Assist", "Spoken camera assistance for blind and low-vision users, fully on-device. One download includes everything: object detection and proximity sensing for Live mode, the vision model for Describe mode, and the speech model for voice questions. Reading mode needs no extra download. The size below is the real total for what's missing.", null, "https://huggingface.co/litert-community/yolox-m-litert", null, null, I00000oIO("litert-community/yolox-m-litert", "yolox_m.tflite"), 51042192L, "yolox_m.tflite", "main", Collections.singletonList(new O1oIOoi0oo(33507904L, "midas", I00000oIO("litert-community/MiDaS-small", "midas_small_256_fp16.tflite"), "midas_small_256_fp16.tflite")), false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -790422, 2047);
/* 94 */            I00000oIO = o1oIOiI11o0;
/* 100 */           I00000oOI = Collections.singletonList(o1oIOiI11o0);
/* 114 */           I0000Il00O = IOOi1I.I000O01llI0("Gemma-4-E2B-it", "SenseVoice (multilingual)");
/* 120 */           I00000oIO("litert-community/PIDNet-S-Cityscapes-LiteRT", "pidnet_s.tflite");
/* 123 */           RuntimeType runtimeType = RuntimeType.UNKNOWN;
/* 125 */           Accelerator accelerator = Accelerator.CPU;
/* 127 */           OOoiliiIoloI oOoiliiIoloI = O1oi0ol1o00.I00000oIO;
/* 133 */           oOoiliiIoloI.I0000oI00("Box Assist — Outdoor (PIDNet-S)", "_");
/* 140 */           I00000oIO("litert-community/Depth-Anything-3-Small", "da3_small_gpu_fp16.tflite");
/* 145 */           oOoiliiIoloI.I0000oI00("Box Assist — Sharp depth (Depth Anything 3)", "_");
/* 152 */           I00000oIO("litert-community/RAM-Plus-LiteRT", "ram_swin_s012_fp16.tflite");
/* 248 */           IOOi1I.I000O01llI0(new O1oIOoi0oo(240240688L, "reweight", I00000oIO("litert-community/RAM-Plus-LiteRT", "ram_reweight_fp16.tflite"), "ram_reweight_fp16.tflite"), new O1oIOoi0oo(123024816L, "stage3_tail", I00000oIO("litert-community/RAM-Plus-LiteRT", "ram_stage3_tail_fp16.tflite"), "ram_stage3_tail_fp16.tflite"), new O1oIOoi0oo(26846512L, "taghead", I00000oIO("litert-community/RAM-Plus-LiteRT", "ram_taghead_fp16.tflite"), "ram_taghead_fp16.tflite"), new O1oIOoi0oo(41904L, "tag_list", I00000oIO("litert-community/RAM-Plus-LiteRT", "ram_tag_list.txt"), "ram_tag_list.txt"), new O1oIOoi0oo(18340L, "tag_threshold", I00000oIO("litert-community/RAM-Plus-LiteRT", "ram_tag_threshold.bin"), "ram_tag_threshold.bin"));
/* 253 */           oOoiliiIoloI.I0000oI00("Box Assist — Scene tags (RAM++)", "_");
                }

                public static final String I00000oIO(String str, String str2) {
/* 7 */             return Oi010OO0.I001IO000("https://huggingface.co/", str, "/resolve/main/", str2, "?download=true");
                }
            }
