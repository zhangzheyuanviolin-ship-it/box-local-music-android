            package com.google.mlkit.vision.mediapipe.facemesh;

            import android.graphics.Rect;
            import com.google.mlkit.vision.common.PointF3D;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.ioOOl1io;
            import p000.ioOoI011li;
            import p000.l0Oo000;
            import p000.l10iOIOOll;
            import p000.l11IIolOIl;
            import p000.lII0I0I000I;
            import p000.lOo01IiI0l;
            import p000.lOolO00l01;
            import p000.li0Iol;
            import p000.li0lll01;
            
/* 126 */   public class FaceMeshListHolder {
                private final List zza;

                public FaceMeshListHolder(List list, List list2, List list3, int i, int i2) {
/* 12 */            int i3 = 0;
/* 21 */            lII0I0I000I.I00000oIO("Landmark list size is not equal to bounding box size", list.size() == list2.size());
/* 38 */            lII0I0I000I.I00000oIO("Landmark list size is not equal to face geometries size", list.size() == list3.size());
/* 46 */            this.zza = new ArrayList();
/* 52 */            while (i3 < list.size()) {
/* 58 */                l0Oo000 l0oo000 = (l0Oo000) list2.get(i3);
                        float f = i;
                        float f2 = i2;
/* 145 */               int i4 = i;
/* 152 */               this.zza.add(new FaceMeshHolder(new Rect(Math.round((l0oo000.I00100l0() - (l0oo000.I000oI1ioi() / 2.0f)) * f), Math.round((l0oo000.I00100o1O0lo() - (l0oo000.I000o00OoI0I() / 2.0f)) * f2), Math.round(((l0oo000.I000oI1ioi() / 2.0f) + l0oo000.I00100l0()) * f), Math.round(((l0oo000.I000o00OoI0I() / 2.0f) + l0oo000.I00100o1O0lo()) * f2)), (ioOoI011li) list.get(i3), (l10iOIOOll) list3.get(i3), i4, i2));
/* 155 */               i3++;
/* 157 */               i = i4;
                    }
                }

                public List<FaceMeshHolder> getFaceMeshHolders() {
/* 1 */             return this.zza;
                }

/* 127 */       public static class FaceMeshHolder {
                    private final Rect zza;
                    private final List zzb = new ArrayList();
                    private final List zzc = new ArrayList();

                    public FaceMeshHolder(Rect rect, ioOoI011li ioooi011li, l10iOIOOll l10ioiooll, int i, int i2) {
/* 4 */                 this.zza = rect;
/* 20 */                l11IIolOIl l11iioloilI000o00OoI0I = l10ioiooll.I000o00OoI0I();
/* 36 */                for (ioOOl1io ioool1io : ioooi011li.I000oI1ioi()) {
                            float f = i;
/* 67 */                    this.zzb.add(PointF3D.from(ioool1io.I000o00OoI0I() * f, ioool1io.I000oI1ioi() * i2, ioool1io.I00100l0() * f));
                        }
/* 83 */                lII0I0I000I.I00000oOI(l11iioloilI000o00OoI0I.I000oI1ioi() % 3 == 0);
/* 96 */                for (int i3 = 0; i3 < l10ioiooll.I000o00OoI0I().I000oI1ioi() / 3; i3++) {
/* 100 */                   int i4 = i3 * 3;
/* 122 */                   this.zzc.add(new int[]{l11iioloilI000o00OoI0I.I000o00OoI0I(i4), l11iioloilI000o00OoI0I.I000o00OoI0I(i4 + 1), l11iioloilI000o00OoI0I.I000o00OoI0I(i4 + 2)});
                        }
                    }

                    public Rect getBoundingBox() {
/* 1 */                 return this.zza;
                    }

                    public List<PointF3D> getPoints() {
/* 1 */                 return this.zzb;
                    }

                    public List<int[]> getTriangles() {
/* 1 */                 return this.zzc;
                    }

/* 128 */           public FaceMeshHolder(Rect rect) {
                        this.zza = rect;
                    }
                }

/* 159 */       public FaceMeshListHolder(List list, int i, int i2) {
                    Rect rect;
                    this.zza = new ArrayList();
/* 161 */           Iterator it = list.iterator();
                    while (it.hasNext()) {
/* 162 */               li0lll01 li0lll01VarI000oI1ioi = ((lOo01IiI0l) it.next()).I000oI1ioi();
/* 163 */               if (li0lll01VarI000oI1ioi.I00100o1O0lo() == 2) {
/* 164 */                   lOolO00l01 loolo00l01I000o00OoI0I = li0lll01VarI000oI1ioi.I000o00OoI0I();
/* 167 */                   rect = new Rect(loolo00l01I000o00OoI0I.I00100o1O0lo(), loolo00l01I000o00OoI0I.I0010I0i(), loolo00l01I000o00OoI0I.I00100l0() + loolo00l01I000o00OoI0I.I00100o1O0lo(), loolo00l01I000o00OoI0I.I000oI1ioi() + loolo00l01I000o00OoI0I.I0010I0i());
                        } else if (li0lll01VarI000oI1ioi.I00100o1O0lo() == 3) {
/* 170 */                   li0Iol li0iolI000oI1ioi = li0lll01VarI000oI1ioi.I000oI1ioi();
                            float f = i;
                            float f2 = i2;
/* 176 */                   rect = new Rect(Math.round(li0iolI000oI1ioi.I00100o1O0lo() * f), Math.round(li0iolI000oI1ioi.I0010I0i() * f2), Math.round((li0iolI000oI1ioi.I00100l0() + li0iolI000oI1ioi.I00100o1O0lo()) * f), Math.round((li0iolI000oI1ioi.I000oI1ioi() + li0iolI000oI1ioi.I0010I0i()) * f2));
                        } else {
                            rect = null;
                        }
                        if (rect != null) {
/* 178 */                   this.zza.add(new FaceMeshHolder(rect));
                        }
                    }
                }
            }
