# Image9View
来自：https://github.com/wobiancao/ImageNice9Layout


# 引入
## Step 1. Add the JitPack repository to your build file

    Add it in your root build.gradle at the end of repositories:
      allprojects {
        repositories {
          ...
          maven { url 'https://www.jitpack.io' }
        }
      }

## Step 2. Add the dependency

    dependencies {
            implementation 'com.github.sinothk:Image9View:2.x.1105'
    }

# 使用
   ## xml: 
    <com.sinothk.view.image9.ImageNice9Layout
        android:id="@+id/item_nice9_image"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:layout_marginStart="36dp"
        android:orientation="vertical"
        app:nice9_candrag="false"
        app:nice9_itemMargin="5dp" />
        
  ## java: 
    adapter
  
        holder.mImageNice9Layout.bindData(mDemoEntities.get(position).pictures);
        holder.mImageNice9Layout.setItemDelegate(new ImageNice9Layout.ItemDelegate() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(mContext, "位置"+ position, Toast.LENGTH_SHORT).show();
            }
        });
        
    activity：
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<DemoEntity> demoEntities = new ArrayList<>();
        String[] pices = getResources().getStringArray(R.array.Pictures);
        for (int i = 8; i >= 0; i--) {
            List<String> picStrings = new ArrayList<>();
            for (int i1 = 0; i1 <= i; i1++) {
                picStrings.add(pices[i1]);
            }
            demoEntities.add(new DemoEntity(picStrings));
        }
        mListAdapter = new ListAdapter(this, demoEntities);
        mRecyclerView.setAdapter(mListAdapter);
