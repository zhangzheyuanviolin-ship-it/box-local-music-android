            package p000;

            import android.content.Intent;
            import android.view.View;
            import android.widget.AdapterView;
            import com.google.android.gms.oss.licenses.OssLicensesActivity;
            
            public final class I1I11i1oI11 implements AdapterView.OnItemClickListener {
                public final int I00iOIl;
                public Object I00iiI;

                public I1I11i1oI11(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    switch (this.I00iOIl) {
                        case 0:
/* 169 */                   I1I1Io i1I1Io = (I1I1Io) this.I00iiI;
/* 171 */                   I1I1OI00IOo i1I1OI00IOo = i1I1Io.I0100i;
/* 173 */                   i1I1OI00IOo.setSelection(i);
/* 180 */                   if (i1I1OI00IOo.getOnItemClickListener() != null) {
/* 188 */                       i1I1OI00IOo.performItemClick(view, i, i1I1Io.I00ooIo0.getItemId(i));
                            }
/* 191 */                   i1I1Io.dismiss();
                            break;
                        case 1:
/* 51 */                    O1Oli0 o1Oli0 = (O1Oli0) this.I00iiI;
/* 53 */                    O10O00o o10O00o = o1Oli0.I00ilI0I1;
/* 87 */                    o1Oli0.setText(o1Oli0.convertSelectionToString(i < 0 ? !o10O00o.I00oliIiO01i.isShowing() ? null : o10O00o.I00iiO.getSelectedItem() : o1Oli0.getAdapter().getItem(i)), false);
/* 90 */                    AdapterView.OnItemClickListener onItemClickListener = o1Oli0.getOnItemClickListener();
/* 94 */                    if (onItemClickListener != null) {
/* 96 */                        if (view == null || i < 0) {
/* 117 */                           view = !o10O00o.I00oliIiO01i.isShowing() ? null : o10O00o.I00iiO.getSelectedView();
/* 135 */                           i = !o10O00o.I00oliIiO01i.isShowing() ? -1 : o10O00o.I00iiO.getSelectedItemPosition();
/* 153 */                           j = !o10O00o.I00oliIiO01i.isShowing() ? Long.MIN_VALUE : o10O00o.I00iiO.getSelectedItemId();
                                }
/* 160 */                       onItemClickListener.onItemClick(o10O00o.I00iiO, view, i, j);
                            }
/* 163 */                   o10O00o.dismiss();
                            break;
                        default:
/* 11 */                    o00i1olooO o00i1olooo = (o00i1olooO) adapterView.getItemAtPosition(i);
/* 15 */                    liii0ioI liii0ioi = (liii0ioI) this.I00iiI;
/* 23 */                    Intent intent = new Intent(liii0ioi.I011Ill, (Class<?>) OssLicensesActivity.class);
/* 28 */                    intent.putExtra("license", o00i1olooo);
/* 31 */                    Ill0lo1oI0I ill0lo1oI0I = liii0ioi.I00oII;
/* 33 */                    if (ill0lo1oI0I == null) {
/* 45 */                        IioIoO10iOiI.I000O01llI0(liii0ioi, "Fragment ", " not attached to Activity");
                                break;
                            } else {
/* 37 */                        ill0lo1oI0I.I00iiI.startActivity(intent, null);
                                break;
                            }
                    }
                }
            }
