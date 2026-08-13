            package androidx.appcompat.app;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.widget.ListView;
            import p000.OOilOli0;
            
/* 24 */    public class AlertController$RecycleListView extends ListView {
                public final int I00iOIl;
                public final int I00iiI;

                public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I00111O);
/* 16 */            this.I00iiI = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
/* 23 */            this.I00iOIl = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
                }

/* 25 */        public AlertController$RecycleListView(Context context) {
/* 26 */            this(context, null);
                }
            }
