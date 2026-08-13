            package com.google.mlkit.vision.common.internal;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import p000.O1o0111OI00;
            import p000.OOiO0Il;
            import p000.lII0I0I000I;
            
/* 8 */     public class MultiFlavorDetectorCreator {
                private final Map zza = new HashMap();

                public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
                    DetectorT create(OptionsT optionst);
                }

                public interface DetectorOptions<DetectorT> {
                }

                public interface MultiFlavorDetector {
                }

                public MultiFlavorDetectorCreator(Set set) {
/* 13 */            HashMap map = new HashMap();
/* 16 */            Iterator it = set.iterator();
/* 24 */            while (it.hasNext()) {
/* 30 */                Registration registration = (Registration) it.next();
/* 32 */                Class clsZzc = registration.zzc();
/* 42 */                if (this.zza.containsKey(clsZzc)) {
/* 44 */                    int iZza = registration.zza();
/* 52 */                    Integer num = (Integer) map.get(clsZzc);
/* 54 */                    lII0I0I000I.I000II(num);
/* 61 */                    if (iZza >= num.intValue()) {
                            }
                        }
/* 69 */                this.zza.put(clsZzc, registration.zzb());
/* 80 */                map.put(clsZzc, Integer.valueOf(registration.zza()));
                    }
                }

                public static synchronized MultiFlavorDetectorCreator getInstance() {
/* 12 */            return (MultiFlavorDetectorCreator) O1o0111OI00.I0000Il00O().I00000oIO(MultiFlavorDetectorCreator.class);
                }

                public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> DetectorT create(OptionsT optionst) {
/* 11 */            OOiO0Il oOiO0Il = (OOiO0Il) this.zza.get(optionst.getClass());
/* 13 */            lII0I0I000I.I000II(oOiO0Il);
/* 22 */            return (DetectorT) ((DetectorCreator) oOiO0Il.get()).create(optionst);
                }

/* 9 */         public static class Registration {
                    private final Class zza;
                    private final OOiO0Il zzb;
                    private final int zzc;

                    public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(Class<? extends OptionsT> cls, OOiO0Il oOiO0Il, int i) {
/* 4 */                 this.zza = cls;
/* 6 */                 this.zzb = oOiO0Il;
/* 8 */                 this.zzc = i;
                    }

                    public final int zza() {
/* 1 */                 return this.zzc;
                    }

                    public final OOiO0Il zzb() {
/* 1 */                 return this.zzb;
                    }

                    public final Class zzc() {
/* 1 */                 return this.zza;
                    }

/* 10 */            public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(Class<? extends OptionsT> cls, OOiO0Il oOiO0Il) {
/* 11 */                this(cls, oOiO0Il, 100);
                    }
                }
            }
