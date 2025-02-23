ServerEvents.recipes((event) => {
    // Mud
    event.custom({
        type: "create:mixing",
        ingredients: [
            {
                item: "minecraft:coarse_dirt",
            },
            {
                fluid: "minecraft:water",
                amount: 8100, //one bucket I think
            },
        ],
        results: [
            {
                item: "Prominade:Mud",
                amount: 2,
            },
        ],
        heatRequirement: "false" //not sure I need this
    });
});


// Tinkers Fixes
// liquid cobalt to cobalt block
event.custom(
    {
      "type": "tconstruct:melting",
      "byproducts": [
        {
          "amount": 72900,
          "fluid": "tconstruct:molten_cobalt"
        }
      },
      "rate": "metal",
      "result": {
        "amount": 1,
        "item": "tconstruct:cobalt_block"
      },
      "time": 32 //needs check
    }
  )